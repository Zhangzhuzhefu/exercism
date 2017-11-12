(ns sublist)

(defn is-subvec [sub super]
	(let [sub-leng (count sub) end (- (count super) sub-leng)]
		(loop [start 0]
			(if (<= start end)
				(if (= sub (subvec super start (+ start sub-leng))) true 
					(recur (inc start)))
				false))))

(defn classify [first second]
	(cond (= first second) :equal 
		(is-subvec first second) :sublist
		(is-subvec second first) :superlist
		:else :unequal))