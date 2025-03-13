(ns a-little-clojure-training.chapter2.average)

(defn mean [& numbers] (/ (apply + numbers) (count numbers)))
(defn mean [& numbers] (/ (reduce + numbers) (count numbers)))

(= 3/2 (mean 1 2))
(= 1.5 (mean 1 2.0))
(= 3 (mean 1 2 3 4 5))
(= 7/2 (mean 1 2 3 4 5 6))
(= 3.5 (mean 1 2 3 4 5 6.0))