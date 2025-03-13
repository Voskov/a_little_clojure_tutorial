(ns a-little-clojure-training.chapter2.mix-it-up)

(defn mix [s1 s2] (apply str (map str s1 s2)))
(defn mix [s1 s2] (apply str (mapcat str s1 s2)))
(defn mix_words [& words] (apply str (apply interleave words)))

(= "a1b2c3d4e5" (mix "abcde" "12345"))
(= "qa1wb2ec3rd4te5" (mix_words "qwert" "abcde" "12345"))
(mix_words "qwert" "abcde" "12345")