(ns beer-song
	 (:require [clojure.string :as string]))

(defn bottles [n]
	(str "bottle" (if (not= n 1)(str "s")))
)

(defn one-it [n]
	(if (= n 1) (str "it") (str "one"))
)

(defn verse [n]
	(if (= n 0) 
		(str "No more bottles of beer on the wall, no more bottles of beer.\n" 
			"Go to the store and buy some more, 99 bottles of beer on the wall.\n")
		(str (format "%d %s of beer on the wall, %d %s of beer.\n" n (bottles n) n (bottles n))
			(format "Take %s down and pass it around, %s %s of beer on the wall.\n" 
				(one-it n) 
				(if (= n 1) (str "no more") (- n 1)) 
				(bottles (- n 1)))))
)

(defn sing ([start] (sing start 0))
	([start end] 
		(loop [song (str) cct start]
			(if (= cct (- end 1)) (string/triml song)
				(recur (str song "\n" (verse cct))(dec cct)))))
)