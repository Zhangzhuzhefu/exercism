(ns hamming)

(defn distance[strand_a strand_b]
	(if (= (count strand_a) (count strand_b))
		(count (filter false? (map = strand_a strand_b)))
		nil)
)