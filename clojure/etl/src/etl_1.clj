(ns etl
	(:require [clojure.string :as string]))

(defn- each[[point words]]
	(reduce #(assoc %1 (string/lower-case %2) point) {} words))

(defn transform[db]
	(reduce #(merge %1 (each %2)) {} db))