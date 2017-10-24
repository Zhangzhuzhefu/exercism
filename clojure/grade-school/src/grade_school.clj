(ns grade-school)

(defn add [db name grade]
	(merge-with (comp vec concat) db {grade [name]}))

(def grade (comp (partial into []) get))

(defn- update-map-values [m f & args]
	(into {} (for [[k v] m] [k (apply f v args)])))

(defn sorted [db]
	(into (sorted-map) (update-map-values db (comp vec sort))))

(def keys (comp clojure.core/keys sorted))
