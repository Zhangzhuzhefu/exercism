(ns series)

(defn slices [string n]
	(if (= n 0) [""]
		(vec (map #(apply str %) (partition n 1 (vec string)))))
)
