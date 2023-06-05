(ns com.github.nx-clj.nx-clj-playground.example-app
  (:require [com.github.nx-clj.nx-clj-playground.utils :as utils])
  (:gen-class))

(defn -main [name & _]
  (println (utils/greet name)))
