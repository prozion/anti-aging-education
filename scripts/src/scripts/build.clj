#_(defdeps
    [[org.clojure/clojure "1.9.0"]
    [org.clojars.prozion/odysseus "0.1.7"]
    [org.clojars.prozion/tabtree "0.6.8"]])

(ns scripts.build
  (:require [clojure.test :refer :all]
            [clojure.string :as s]
            [org.clojars.prozion.odysseus.io :refer :all]
            [org.clojars.prozion.odysseus.utils :refer :all]
            [org.clojars.prozion.odysseus.text :as text]
            [org.clojars.prozion.odysseus.debug :refer :all]
            [org.clojars.prozion.tabtree.tabtree :as tabtree]
            [org.clojars.prozion.tabtree.output :as output]
            [org.clojars.prozion.tabtree.utils :as utils]
            ))

(def ^:dynamic *tabtree* {})

(def root-url "https://github.com/prozion/anti-aging-education")

(defn textify [id]
  (-> id name (s/replace "_" " ") text/titlefy))

(defn get-page-link [course-id]
  (format "%s/pages/%s.md" root-url (-> course-id name (s/replace "_" "-") s/lower-case)))

(defn get-course-name [course-id]
  (textify course-id))

(defn get-course-label [course-id tabtree]
  (let [course-item (tabtree course-id {})
        label (course-item :label nil)
        label (and label (get-course-name label))]
    (or label (get-course-name course-id))))

; (defn make-md-bullet-list [seq]
;   (reduce
;     (fn [acc item]
;       (let [item-page-url (format "%s/pages/%s.md" root-url (-> item (s/replace " " "-") s/lower-case))]
;         (format "%s* [%s](%s)\n" acc item item-page-url)))
;     ""
;     seq))

(defn make-mermaid-href [course-id]
  (format "click %s href \"%s\" _blank" (name course-id) (get-page-link course-id)))

(defn make-mermaid-node [course-id]
  (format "%s[%s]:::href" (name course-id) (get-course-label course-id *tabtree*)))

(defn make-mermaid-arrows [directed-graph]
  ; (--- directed-graph)
  (reduce
    (fn [acc [course-id follow-ups]]
      (cond
        (coll? follow-ups)
          (format
            "%s%s\n  "
            acc
            (->> follow-ups (map #(format "%s -.-> %s" (name course-id) (name %))) (s/join "\n  ")))
        :else
          (format "%s%s --> %s\n  " acc (name course-id) (name follow-ups))))
    ""
    directed-graph))

(defn make-directed-graph
  ([start-nodes]
    (make-directed-graph start-nodes {}))
  ([start-nodes directed-graph]
    (cond
      (empty? start-nodes) directed-graph
      :else
        (let [start-node-id (first start-nodes)
              start-node-item (*tabtree* start-node-id)
              follow-ups (:to start-node-item)
              extended-start-nodes (rest start-nodes)
              extended-start-nodes
                (cond
                  (not follow-ups) extended-start-nodes
                  (coll? follow-ups) (concat extended-start-nodes follow-ups)
                  :else (conj extended-start-nodes follow-ups))
              extended-start-nodes (distinct extended-start-nodes)]
            (make-directed-graph
              extended-start-nodes
              (if follow-ups
                (merge directed-graph {start-node-id follow-ups})
                directed-graph))))))

(defn make-md [tabtree-file md-file md-template]
  (binding [*tabtree* (tabtree/parse-tab-tree tabtree-file)]
    (let [
          md-template (slurp md-template)
          courses-ids (utils/$t биохимик.курсы *tabtree*)
          mermaid-nodes (->> courses-ids (map make-mermaid-node) (s/join "\n  "))
          mermaid-hrefs (->> courses-ids (map make-mermaid-href) (s/join "\n  "))
          mermaid-arrows (make-mermaid-arrows (make-directed-graph [:Общая_химия :Высшая_математика :Общая_биология :Общая_физика :Информатика]))
          conditional-courses-ids-list (->> courses-ids (map *tabtree*) (filter #(:conditional %)) (map :__id) (map name) (s/join ","))
          md (s/replace md-template "{{nodes}}" mermaid-nodes)
          md (s/replace md "{{arrows}}" mermaid-arrows)
          md (s/replace md "{{conditional courses}}" conditional-courses-ids-list)
          md (s/replace md "{{links}}" mermaid-hrefs)
          ]
      (spit md-file md))))

(defn run []
  (text/titlefy "foo")
  (make-md
    "../knowledge/biochemist.tree"
    "../biochemist.md"
    "../templates/biochemist.template"
    ))
