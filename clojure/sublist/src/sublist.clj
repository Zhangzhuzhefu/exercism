(ns sublist)

(defn- toStr [list] 
	(apply str (map (partial str ":") list)))

(defn- is-subvec [sub super]
	(.contains (toStr super) (toStr sub)))

(defn classify [first second]
	(cond (= first second) :equal 
		(is-subvec first second) :sublist
		(is-subvec second first) :superlist
		:else :unequal))