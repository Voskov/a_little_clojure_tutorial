(ns a-little-clojure-training.chapter5.popularity)

(def l [100 150 90 200 120 150 90])

(defn popularity [l]
  (cond
  (= 0 (count l)) 0
  (= 1 (count l)) (first l)
  (< 1 (count l)) (+ (last l) (/ (popularity (butlast l)) 2))))

(defn popularity_reduce [l]
  (reduce (fn [pop l] (+ l (/ pop 2))) 0 l))

(defn popularity_remainder [l]
  (loop [remaining l
         pop 0]
    (if (empty? remaining)
      pop
      (recur (rest remaining)
             (+ (first remaining) (/ pop 2))))))

(popularity l)

; sanity
(= 15 (popularity [10 10]))
(= 45 (popularity [20 20 30]))

(= 15 (popularity_reduce [10 10]))
(= 45 (popularity_reduce [20 20 30]))

(= 15 (popularity_remainder [10 10]))
(= 45 (popularity_remainder [20 20 30]))

(= (popularity l) (popularity_reduce l) (popularity_remainder l))