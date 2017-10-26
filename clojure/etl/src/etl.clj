(ns etl
	(:require [clojure.string :as string]))

(defn transform[db]
	(into {} (for [[point words] db w words]
		[(string/lower-case w) point])))