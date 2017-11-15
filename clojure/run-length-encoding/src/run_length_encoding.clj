(ns run-length-encoding)

(defn- combine [[consecutive ch]]
	(let [cnt (count consecutive)]
		(if (= cnt 1) ch
			(str cnt ch))))

(defn- expand [[code ch]]
	(let [cnt (count code)]
		(if (= cnt 1) ch 
			(let [repeats (read-string (subs code 0 (dec cnt)))]
				(apply str (repeat repeats ch))))))

(defn run-length-encode [s]
	(if (= s "") ""
		(apply str (map combine (re-seq #"(.)\1{0,}" s)))))

(defn run-length-decode [s]
	(if (= s "") ""
 	 	(apply str (map expand (re-seq #"\d*(.)" s)))))