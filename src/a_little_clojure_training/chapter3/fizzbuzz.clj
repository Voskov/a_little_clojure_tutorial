(ns a-little-clojure-training.chapter3.fizzbuzz)

(defn fizzbuzz [n]
  (for [x (range 1 (inc n))] 
    (cond
     (and (= (rem x 3) 0) (= (rem x 5) 0)) "FizzBuzz"
     (= (rem x 3) 0) "Fizz"
     (= (rem x 5) 0) "Buzz"
     :else x)))

(fizzbuzz 33)