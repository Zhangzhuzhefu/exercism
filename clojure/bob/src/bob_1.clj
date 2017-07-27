(ns bob)

(defn response-for [say] 
	(def say-trim (clojure.string/trim say))
	(def lower-count (count (re-seq #"[a-z]" say-trim)))
	(def upper-count (count (re-seq #"[A-Z]" say-trim)))
	(if (= "" say-trim) (str "Fine. Be that way!")
		(if (and (= lower-count 0) (not= upper-count 0))
			(str "Whoa, chill out!")
			(if (clojure.string/ends-with?  say-trim "?") 
				(str "Sure.")
				(str "Whatever."))))
)