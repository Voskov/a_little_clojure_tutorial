(ns a-little-clojure-training.chapter5.popularity)

(def l [100 150 90 200 120 150 90])

(defn popularity [l]
  (cond
  (= 0 (count l)) 0
  (= 1 (count l)) (first l)
  (< 1 (count l)) (+ (last l) (/ (popularity (butlast l)) 2))))

(popularity l)

(popularity [20 20 30])