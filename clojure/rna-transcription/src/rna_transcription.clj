(ns rna-transcription)

(defn first-in-vec [word-vec]
	(case (get word-vec 0) 
	"C" \G
	"G" \C
	"A" \U
	"T" \A
	(throw (AssertionError.)))
)

(defn to-rna-vec [result word-vec]
	(if ( > (count word-vec) 0)
		(to-rna-vec (conj result (first-in-vec word-vec)) (subvec word-vec 1 (count word-vec)))
		(subvec result 0 (count result))
	)
)

(defn to-rna [input]
	(let [result (vector)]
		(clojure.string/join (to-rna-vec result (clojure.string/split input #""))))
)

