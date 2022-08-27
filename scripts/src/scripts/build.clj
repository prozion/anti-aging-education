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

(def root-url "https://github.com/prozion/anti-aging-education/blob/main")

(defn textify [id]
  (-> id name (s/replace "_" " ") text/titlefy))

(defn get-page-link [course-id]
  (format "%s/pages/%s.md" root-url (-> course-id name)))

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
          (format "%s%s -.-> %s\n  " acc (name course-id) (name follow-ups))))
    ""
    directed-graph))

(defn make-directed-graph
  ([start-nodes tabtree]
    (make-directed-graph start-nodes tabtree {}))
  ([start-nodes tabtree directed-graph]
    (cond
      (empty? start-nodes) directed-graph
      :else
        (let [start-node-id (first start-nodes)
              start-node-item (tabtree start-node-id)
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
              tabtree
              (if follow-ups
                (merge directed-graph {start-node-id follow-ups})
                directed-graph))))))

(defn get-items-by-condition [tabtree condition]
  (let [result (filter condition (vals tabtree))]
    (if (empty? result) nil result)))

(defn get-nodes-from-directed-graph [directed-graph]
  (-> (concat (keys directed-graph) (vals directed-graph)) flatten distinct))

(def tabtree-file "../knowledge/biochemist.tree")
(def root-template-file "../templates/biochemist.template.md")
; (def page-template-file "../templates/page.template.md")
(def biochemistry-centered-follow-ups-file "../knowledge/biochemistry-follows.tree")
(def root-file "../biochemist.md")

(defn make-md []
  (binding [*tabtree* (tabtree/parse-tab-tree tabtree-file)]
    (let [
          root-template (slurp root-template-file)
          courses-ids (utils/$t биохимик.курсы *tabtree*)
          mermaid-hrefs (->> courses-ids (map make-mermaid-href) (s/join "\n  "))
          directed-graph (make-directed-graph
                            [
                            :Аналитическая_геометрия
                            :Аналитическая_химия
                            :Информатика
                            :Линейная_алгебра
                            :Математический_анализ
                            :Механика
                            :Неорганическая_химия
                            :Общая_химия
                            :Общая_биология
                            :Общая_физика
                            :Основы_радиохимии
                            :Физиология
                            :Химическая_биология
                            ]
                            *tabtree*)
          nodes-ids (get-nodes-from-directed-graph directed-graph)
          get-year (fn [node-id] (let [year (:year (*tabtree* node-id))]
                                    (cond
                                      (coll? year) (first year)
                                      :else year)))
          filter-nodes-by-year (fn [year] (filter (fn [node-id] (= (get-year node-id) year)) nodes-ids))
          nodes-ids-1 (filter-nodes-by-year 1)
          nodes-ids-2 (filter-nodes-by-year 2)
          nodes-ids-3 (filter-nodes-by-year 3)
          nodes-ids-4 (filter-nodes-by-year 4)
          nodes-ids-5 (filter-nodes-by-year 5)
          nodes-ids-6 (filter-nodes-by-year 6)
          nodes-ids-other (minus nodes-ids nodes-ids-1 nodes-ids-2 nodes-ids-3 nodes-ids-4 nodes-ids-5 nodes-ids-6)

          make-mermaid-nodes-block (fn [nodes-ids] (->> nodes-ids (map make-mermaid-node) (s/join "\n  ")))
          mermaid-nodes-1 (make-mermaid-nodes-block nodes-ids-1)
          mermaid-nodes-2 (make-mermaid-nodes-block nodes-ids-2)
          mermaid-nodes-3 (make-mermaid-nodes-block nodes-ids-3)
          mermaid-nodes-4 (make-mermaid-nodes-block nodes-ids-4)
          mermaid-nodes-5 (make-mermaid-nodes-block nodes-ids-5)
          mermaid-nodes-6 (make-mermaid-nodes-block nodes-ids-6)
          mermaid-nodes-other (make-mermaid-nodes-block nodes-ids-other)

          mermaid-arrows (make-mermaid-arrows directed-graph)

          conditional-courses-ids-list (->> courses-ids (map *tabtree*) (filter #(:conditional %)) (map :__id) (map name) (s/join ","))

          md (s/replace root-template "{{nodes-year-1}}" mermaid-nodes-1)
          md (s/replace md "{{nodes-year-2}}" mermaid-nodes-2)
          md (s/replace md "{{nodes-year-3}}" mermaid-nodes-3)
          md (s/replace md "{{nodes-year-4}}" mermaid-nodes-4)
          md (s/replace md "{{nodes-year-5}}" mermaid-nodes-5)
          md (s/replace md "{{nodes-year-6}}" mermaid-nodes-6)
          md (s/replace md "{{nodes-other}}" mermaid-nodes-other)
          md (s/replace md "{{arrows}}" mermaid-arrows)
          md (s/replace md "{{conditional courses}}" conditional-courses-ids-list)
          md (s/replace md "{{hrefs}}" mermaid-hrefs)

          biochemistry-links-tabtree (tabtree/parse-tab-tree biochemistry-centered-follow-ups-file)
          biochemistry-directed-graph (make-directed-graph [:Биохимия_старения] biochemistry-links-tabtree)
          mermaid-biochemistry-nodes-ids (get-nodes-from-directed-graph biochemistry-directed-graph)
          mermaid-biochemistry-nodes (->> mermaid-biochemistry-nodes-ids (map make-mermaid-node) (s/join "\n  "))
          mermaid-biochemistry-arrows (make-mermaid-arrows biochemistry-directed-graph)
          mermaid-biochemistry-hrefs (->> mermaid-biochemistry-nodes-ids (map make-mermaid-href) (s/join "\n  "))

          md (s/replace md "{{biochemistry-nodes}}" mermaid-biochemistry-nodes)
          md (s/replace md "{{biochemistry-arrows}}" mermaid-biochemistry-arrows)
          md (s/replace md "{{biochemistry-hrefs}}" mermaid-biochemistry-hrefs)

          is-type? (fn [type-to-compare]
                      (fn [item]
                        (let [type (:type item)]
                                  (cond
                                    (coll? type) (index-of? type type-to-compare)
                                    :else (= type type-to-compare)))))
          video? (is-type? :video)
          book? (is-type? :book)
          textbook? (is-type? :textbook)
          taskbook? (is-type? :taskbook)
          mooc? (is-type? :mooc)
          website? (is-type? :website)
          slides? (is-type? :slides)

          _ (doall (for [course-id courses-ids]
              (let [course-file (format "../pages/%s.md" (name course-id))
                    video-lectures (get-items-by-condition *tabtree* (fn [item] (and (video? item)) (= (:course item) course-id)))
                    textbooks (get-items-by-condition *tabtree* (fn [item] (and (textbook? item) (= (:course item) course-id))))
                    books (get-items-by-condition *tabtree* (fn [item] (and (book? item) (= (:course item) course-id))))
                    moocs (get-items-by-condition *tabtree* (fn [item] (and (mooc? item) (= (:course item) course-id))))
                    taskbooks (get-items-by-condition *tabtree* (fn [item] (and (taskbook? item) (= (:course item) course-id))))
                    websites (get-items-by-condition *tabtree* (fn [item] (and (website? item) (= (:course item) course-id))))
                    slides (get-items-by-condition *tabtree* (fn [item] (and (slides? item) (= (:course item) course-id))))
                    process-author (fn [author] (-> author name (s/replace #"_" " ") (s/replace #"([A-ZА-Я])([A-ZА-Я])" "$1.$2")))
                    make-md-list-item (fn [item]
                                        (let [title (textify (:__id item))
                                              type (:type item)
                                              title (if (index-of? [:book :textbook :video] type)
                                                          (-> title (s/split #" ") butlast (#(s/join " " %)))
                                                          title)
                                              url (item :url)
                                              weeks (:weeks item)
                                              lectures (:lectures item)
                                              hours (:hours item)
                                              mins (:mins item)
                                              author (:author item)
                                              author (cond
                                                        (coll? author)
                                                          (->> author (map process-author) (s/join ", "))
                                                        (not author)
                                                          nil
                                                        :else
                                                          (process-author author))
                                              full-title (format "%s%s"
                                                                  title
                                                                  (if author (format ", %s" author) ""))
                                              unifaculty (:fac item)
                                              [uni faculty] (and unifaculty (s/split (name unifaculty) #"_"))
                                              full-title (if unifaculty
                                                            (format "%s, %s %s" full-title uni faculty)
                                                            full-title)
                                              additional-info (cond
                                                                (index-of? [:video] type)
                                                                  (format " (%s%s%s)"
                                                                    (if lectures (format "%s лекций" lectures) "")
                                                                    (if hours (format ", %s часов" hours) "")
                                                                    (if mins (format ", %s минут" mins) ""))
                                                                (index-of? [:mooc] type)
                                                                  (format " (%s%s)"
                                                                    (if weeks (format "%s недель" weeks) "")
                                                                    (if hours (format ", %s часов" hours) ""))
                                                                :else
                                                                  "")

                                              ]
                                          (format "* %s%s"
                                                  (if url
                                                    (format "[%s](%s)" full-title url)
                                                    full-title)
                                                  additional-info)))
                    video-lectures-list (and video-lectures (->> video-lectures (map make-md-list-item) (s/join "\n")))
                    textbooks-list (and textbooks (->> textbooks (map make-md-list-item) (s/join "\n")))
                    books-list (and books (->> books (map make-md-list-item) (s/join "\n")))
                    moocs-list (and moocs (->> moocs (map make-md-list-item) (s/join "\n")))
                    slides-list (and slides (->> slides (map make-md-list-item) (s/join "\n")))
                    taskbooks-list (and taskbooks (->> taskbooks (map make-md-list-item) (s/join "\n")))
                    websites-list (and websites (->> websites (map make-md-list-item) (s/join "\n")))
                    course-page (format "# %s\n\n%s%s%s%s%s%s%s"
                                        (get-course-name course-id)
                                        (if moocs (format "## МООКи (MOOCs)\n\n%s\n\n" moocs-list) "")
                                        (if video-lectures (format "## Видеолекции\n\n%s\n\n" video-lectures-list) "")
                                        (if textbooks (format "## Учебники\n\n%s\n\n" textbooks-list) "")
                                        (if slides (format "## Слайды\n\n%s\n\n" slides-list) "")
                                        (if taskbooks (format "## Задачники\n\n%s\n\n" taskbooks-list) "")
                                        (if books (format "## Книги\n\n%s\n\n" books-list) "")
                                        (if websites (format "## Сайты\n\n%s\n\n" websites-list) ""))
                    ]
                (spit course-file course-page))))
          ]
      (spit root-file md))))

(defn run []
  (text/titlefy "foo")
  (make-md))
