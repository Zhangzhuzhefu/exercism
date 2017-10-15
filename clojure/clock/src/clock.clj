(ns clock)

(def daymod (* 60 24))

(defn clock [hour minute]
	(let [h (mod hour 24)]
		(mod (+ (* 60 h) minute) daymod)))

(defn clock->string [clock]
	(format "%02d:%02d" (quot clock 60) (mod clock 60)))

(defn add-time [clock minutes]
	(mod (+ clock minutes) daymod))