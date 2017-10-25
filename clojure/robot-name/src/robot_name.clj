(ns robot-name)

(def UPPER
	(map char (range 65 91)))

(def DIGIT
	(map char (range 48 58)))

(defn new-name [& _]
	(apply str (concat (take 2 (repeatedly #(nth UPPER (rand 26))))
		(take 3 (repeatedly #(nth DIGIT (rand 10)))))))

(defn robot[]
	(atom {:name (new-name)}))

(defn reset-name[robot]
	(swap! robot update :name new-name))

(defn robot-name[robot]
	(get @robot :name))
