(ns a-little-clojure-training.chapter2.mix-it-up)

(defn mix [s1 s2] (apply str (map str s1 s2)))

(= "a1b2c3d4e5" (mix "abcde" "12345"))