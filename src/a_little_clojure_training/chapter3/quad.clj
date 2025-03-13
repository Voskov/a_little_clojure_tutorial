(ns a-little-clojure-training.chapter3.quad)

(defn quad [a b c]
  (let [discriminant (- (* b b) (* 4 a c))]
        (cond
          (zero? a) (/ (- c) b)
          (neg? discriminant) "imaginary"
          (zero? discriminant) (/ (- b) (* 2 a))
          (pos? discriminant) (list (/ (+ (- b) (Math/sqrt discriminant)) (* 2 a))
                                    (/ (- (- b) (Math/sqrt discriminant)) (* 2 a))))))

(quad 0 2 3)

(= -1 (quad 1 2 1))
(= "imaginary" (quad 1 2 3))
(= -3/2 (quad 0 2 3))
(= [0.0 -1.0] (quad 1 1 0))
(= [0.5 -0.25] (quad 1 -0.25 -0.125))