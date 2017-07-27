(ns bob)

(defn response-for [say] 
	(def say-trim (clojure.string/trim say))
	(if (= "" say-trim) (str "Fine. Be that way!")
		(if (and (not= nil (re-matches #"(.*)[a-zA-Z](.*)" say-trim))
			  (= (clojure.string/upper-case say-trim) say-trim))
			(str "Whoa, chill out!")
			(if (clojure.string/ends-with?  say-trim "?") 
				(str "Sure.")
				(str "Whatever."))))
)