(ns anagram
	 (:require [clojure.string :as string]))

(defn anagrams-for [origin wordlist]
	(let [result (transient [])]
		(doseq [word wordlist] 
			(if (not= (string/lower-case word)(string/lower-case origin))
				(if (= (into (sorted-map) (frequencies (re-seq #"\w" (string/lower-case word))))
					(into (sorted-map) (frequencies (re-seq #"\w" (string/lower-case origin))))
					) (conj! result word)
				)
			)
	    )
	    (persistent! result))
)