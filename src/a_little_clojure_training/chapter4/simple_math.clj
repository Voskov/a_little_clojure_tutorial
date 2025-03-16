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

(defn sin-term-sign [n] (- (- (rem n 4) 2)))
(range 1 10 2)
(map sin-term-sign (range 1 10 2))

(defn sin-term [x n]
  (* (sin-term-sign n)
     (/ (pow x n) (fac n))))

(sin-term 1 1)
(= 1N (sin-term 1 1))
(= -1/6 (sin-term 1 3))
(= 1/120 (sin-term 1 5))

(defn sin [x n]
  (let [ns (range 1 n 2)
        terms (map (fn [n] (sin-term x n)) ns)]
    (apply + terms)))

(= 5/6 (sin 1 5))
(sin 1 10)
(sin 1 20)

(with-precision 20 (bigdec (sin 1 20)))
(= 0.84147098480789650663M (with-precision 20 (bigdec (sin 1 20))))
(Math/sin 1)
(= 0.8414709848078965 (Math/sin 1))
(with-precision 16 (bigdec (sin 1 20)))
(= (Math/sin 1) (with-precision 16 (bigdec (sin 1 20))))