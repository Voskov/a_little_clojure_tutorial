(ns a-little-clojure-training.chapter2.pythagorus)

(defn pythag? [a b c] (= (+ (* a a) (* b b)) (* c c)))

(pythag? 3 4 5)
(= true (pythag? 3 4 5))
(= true (pythag? 5 12 13))
(= false (pythag? 1 2 3))