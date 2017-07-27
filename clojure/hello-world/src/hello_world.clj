(ns hello-world)

(defn hello 
	([] (hello "World"))
	([username](format "Hello, %s!" username))
)