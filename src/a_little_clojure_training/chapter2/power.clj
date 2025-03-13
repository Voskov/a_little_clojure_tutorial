(ns a-little-clojure-training.chapter2.power)

(defn power [x e] (apply * (repeat e x)))

(= 8 (power 2 3))
(= 9 (power 3 2))
(= 27 (power 3 3))
(= 0 (power 0 3))
(= 1 (power 3 0))