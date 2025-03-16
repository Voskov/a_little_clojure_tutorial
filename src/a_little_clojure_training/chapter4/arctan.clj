(ns a-little-clojure-training.chapter4.arctan)

(defn fac
  ([n] (fac n 1))
  ([n f] (if (= n 1) f (fac (dec n) (* n f)))))

(defn pow
  ([n e] (pow n e 1N))
  ([n e p] (if (< e 1) p (pow n (dec e) (* p n)))))

(defn sin-term-sign [n] (- (- (rem n 4) 2)))

(defn sin-term [x n]
  (* (sin-term-sign n)
     (/ (pow x n) (fac n))))

(defn sin [x n]
  (let [ns (range 1 n 2)
        terms (map (fn [n] (sin-term x n)) ns)]
    (apply + terms)))

(defn arctan-term [x n]
  (* (sin-term-sign n)
     (/ (pow x n) n)))

(defn arctan [x n]
  (let [ns (range 1 n 2)
        terms (map (fn [n] (arctan-term x n)) ns)]
    (apply + terms))) 

(* 4.0 (arctan 1 2000))
(* 4.0 (arctan 1 6000))