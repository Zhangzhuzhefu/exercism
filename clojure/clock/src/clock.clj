(ns clock)

(def ^:private daymod (* 60 24))

(defn- norm [unnormed] (mod unnormed daymod))

(defn clock [hour minute] (norm (+ (* 60 hour) minute)))

(defn clock->string [clock]
	(format "%02d:%02d" (quot clock 60) (mod clock 60)))

(def add-time (comp norm +))