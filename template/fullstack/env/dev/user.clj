(ns user
  "Tools for interactive development with the REPL. This file should
  not be included in a production build of the application."
  (:require [clojure.string :as str]
            [clojure.java.io :as io]
            [clojure.java.javadoc :refer (javadoc)]
            [clojure.string :as str]
            [clojure.pprint :refer (pprint)]
            [clojure.repl :refer (apropos dir doc find-doc pst source)]
            [clojure.test :as test]
            [clojure.tools.namespace.repl :as tools-ns]))


(tools-ns/set-refresh-dirs "src")

(defn reset
  []
  (tools-ns/refresh))

(comment
  (tools-ns/refresh-all)
  ;; start server
  (tools-ns/refresh :after 'com.example.main/-main))
