(ns series)

(defn slices [string n]
	(if (= n 0) [""]
		(let [strVec (vec string) end (- (count strVec) n)]
			(loop[coll [] indx 0]
				(if (> indx end) coll
					(recur (conj coll (apply str (subvec strVec indx (+ indx n))))(inc indx))))))
)
