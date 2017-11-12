(ns sublist)

(defn- is-subvec [sub super]
	(contains? (into #{}(partition (count sub) 1 super)) sub))

(defn classify [first second]
	(cond (= first second) :equal 
		(is-subvec first second) :sublist
		(is-subvec second first) :superlist
		:else :unequal))