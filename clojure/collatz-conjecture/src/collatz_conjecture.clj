(ns collatz-conjecture)

(defn next-num [x]
	(if (odd? x) (inc (* x 3)) (/ x 2))
)

(defn findsteps [n steps]
	(if (= n 1) (count steps) (findsteps (next-num n) (conj steps n)))
)

(defn collatz [n]
	(if (<= n 0) (throw (IllegalArgumentException.))(findsteps n []))
)