(defproject lambdacd "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Apache License, version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/data.json "0.2.5"]
                 [me.raynes/conch "0.8.0"]
                 [org.clojure/core.async "0.1.338.0-5c5012-alpha"]
                 [compojure "1.1.8"]]
  :ring {:handler lambdacd.server/app
         :init lambdacd.server/start-pipeline-thread }
  :plugins [[lein-ring "0.8.11"]]
  :main lambdacd.core)
