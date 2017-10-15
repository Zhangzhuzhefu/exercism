(ns phone-number)

(defn cleaned[raw]
	(clojure.string/replace 
		(apply str (filter #(Character/isDigit %) raw)) 
		#"^1(\d{10})$" "$1"))

(defn number[raw]
	(let [clean (cleaned raw) cnt (count clean) invalid (apply str (take 10 (repeat 0)))]
		(if (= (count clean) 10)
			clean
			invalid)))

(defn area-code[raw]
	(subs (number raw) 0 3))

(defn pretty-print[raw]
	(let [number (number raw)]
		(format "(%s) %s-%s" (subs number 0 3) (subs number 3 6) (subs number 6))))