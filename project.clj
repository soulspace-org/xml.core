(defproject org.soulspace.clj/xml.core "0.5.0"
  :description "The xml.core library contains code to work with XML in Clojure."
  :url "https://github.com/lsolbach/CljXML"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  ; use deps.edn dependencies
  :plugins [[lein-tools-deps "0.4.5"]]
  :middleware [lein-tools-deps.plugin/resolve-dependencies-with-deps-edn]
  :lein-tools-deps/config {:config-files [:install :user :project]}

  :test-paths ["test"]
  :scm {:name "git" :url "https://github.com/soulspace-org/xml.core"}
  :deploy-repositories [["clojars" {:sign-releases false :url "https://clojars.org/repo"}]])
