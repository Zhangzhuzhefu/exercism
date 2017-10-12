(ns collatz-conjecture)

(defn next-step [x]
	(if (odd? x) (inc (* x 3)) (/ x 2))
)

(defn collatz [n]
	(if (<= n 0)(throw (IllegalArgumentException.))
		(loop [x n cnt 0]
			(if (= x 1) cnt
				(recur (next-step x) (inc cnt) ))))
)