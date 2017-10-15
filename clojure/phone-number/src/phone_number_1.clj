(ns phone-number)

(defn clean[raw]
	(apply str (filter #(Character/isDigit %) raw)))

(defn number[raw]
	(let [clean-number (clean raw) cnt (count clean-number) invalid (apply str (take 10 (repeat 0)))]
		(cond (or (> cnt 11) (< cnt 10)) invalid
			(= cnt 11) (if (not= (first clean-number) \1) invalid (subs clean-number 1))
			:else clean-number)))

(defn area-code[raw]
	(subs (number raw) 0 3))

(defn pretty-print[raw]
	(let [number (number raw)]
		(str "(" (subs number 0 3) ") " (subs number 3 6) "-" (subs number 6))))