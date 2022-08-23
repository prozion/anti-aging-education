(defproject anti-aging-education "0.0.1"
  :description "Anti-aging education scripts"
  :url "https://github.com/prozion/anti-aging-education"
  :dependencies [
                [org.clojars.prozion/odysseus "0.1.7"]
                [org.clojars.prozion/tabtree "0.6.8"]
                [org.clojure/data.csv "1.0.1"]
                ]
  :plugins [
            ; [lein-ancient "0.6.15"]
            [lein-oneoff "0.3.2"]
            ]
  :main scripts.build
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.9.0"]]}}
  :release-tasks [
                  ; ["build-turtle"]
                  ]
  :repl-options {
    :init-ns scripts.build
  }
)
