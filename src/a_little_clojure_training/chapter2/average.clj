(ns a-little-clojure-training.chapter2.average)

(defn mean [x y] (/ (+ x y) 2))

(= 3/2 (mean 1 2))
(= 1.5 (mean 1 2.0))