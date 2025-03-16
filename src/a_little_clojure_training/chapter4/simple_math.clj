(ns a-little-clojure-training.chapter4.simple-math)

(defn fac
  ([n] (fac n 1))
  ([n f] (if (= n 1) f (fac (dec n) (* n f)))))

(= 120 (fac 5))
(= 720 (fac 6))

(defn pow
  ([n e] (pow n e 1N))
  ([n e p] (if (< e 1) p (pow n (dec e) (* p n)))))

(= (pow 2 3) 8)
(= (pow 3 2) 9)
(= (pow 3 3) 27)