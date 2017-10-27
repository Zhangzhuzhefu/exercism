(ns flatten-array)

(defn flatten[arry]
	(vec (filter (complement nil?) (clojure.core/flatten arry))))