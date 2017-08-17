(ns word-count
  (:require [clojure.string :as string]))

(defn word-count [sentence]
  (frequencies (re-seq #"\w+" (string/lower-case sentence))))
