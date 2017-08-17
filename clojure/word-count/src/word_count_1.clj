(ns word-count)

(defn count-first [result first-word]
	(let [low-word (clojure.string/lower-case first-word)]
		(if (contains? result low-word)
			(assoc result low-word (+ 1 (get result low-word)))
			(assoc result low-word 1)))
	
)

(defn count-matcher [result matcher]
	(let [next-word (re-find matcher)]
		(if (not= nil next-word)
			(count-matcher (count-first result next-word) matcher)
			(merge nil result)))
)

(defn word-count [input] 
	(count-matcher (hash-map) (re-matcher #"[a-zA-Z0-9]+" input))
)
