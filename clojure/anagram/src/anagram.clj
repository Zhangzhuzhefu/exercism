(ns anagram
	 (:require [clojure.string :as string]))

(defn anagram? [w1 w2]
	(let [x (string/lower-case w1) y (string/lower-case w2)]
	    (and (not= x y)
	         (= (sort x) (sort y))
	    )
	)
)

(defn anagrams-for [origin wordlist]
	(filter (partial anagram? origin) wordlist)
)