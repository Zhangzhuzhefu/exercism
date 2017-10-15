(ns nucleotide-count)

(defn count [ch string]
	(if (clojure.string/includes? "AGTC" (str ch)) 
		(clojure.core/count (filter #(= ch %) (seq string)))
		(throw (Exception.)))
)

(defn nucleotide-counts [string]
	(merge {\A 0, \T 0, \C 0, \G 0} (frequencies string))
)