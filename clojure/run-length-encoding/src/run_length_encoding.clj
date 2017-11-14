(ns run-length-encoding)

(defn- combine [consecutive]
	(let [cnt (count consecutive)]
		(if (= cnt 1) consecutive
			(str cnt (first consecutive)))))

(defn- expand [code]
	(let [cnt (count code)]
		(if (= cnt 1) code
			(apply str (take (read-string (subs code 0 (dec cnt))) (repeat (last code)))))))

(defn run-length-encode [s]
	(if (= s "") ""
		(apply str (map combine (first (apply map vector (re-seq #"(.)\1{0,}" s)))))))

(defn run-length-decode [s]
	(if (= s "") ""
 	 	(apply str (map expand (first (apply map vector (re-seq #"\d*(.)" s)))))))