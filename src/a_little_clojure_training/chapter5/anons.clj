(ns a-little-clojure-training.chapter5.anons)

(fn [x] (* x x))
(= 9((fn [x] (* x x)) 3))
(def square (fn [x] (* x x)))
(= 9 (square 3))

(map (fn [x] (* x x)) [1 2 3])

(#(* % %) 3)
(= 9 (#(* % %) 3))
(map #(* % % %) [1 2 3])

(def midway (fn [a b] (/ (+ a b) 2)))
(= 15/2 (midway 6 9))
(= 15/2 (midway 5 10))
(defn midway [a b] (/ (+ a b) 2))
(def midway #(/ (+ %1 %2) 2))

(= 6 (apply + [1 2 3]))
(= 6 (reduce + [1 2 3]))

(reduce midway [2 3])
(= 5/2 (reduce midway [2 3]))

(reduce midway [2 3 4])

(reductions + [1 2 3 4 5 6 7 8 9])
(reductions midway [1 2 3 4 5])

