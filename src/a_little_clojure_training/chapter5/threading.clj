(ns a-little-clojure-training.chapter5.threading
  (:require [a-little-clojure-training.chapter5.anons :as anons]))

(reduce anons/midway (map anons/square (range 10)))
(= 33789/512 (reduce anons/midway (map anons/square (range 10))))
(= 33789/512 (->> (range 10) (map anons/square) (reduce anons/midway)))
(= (reduce anons/midway (map anons/square (range 10)))
   (->> (range 10) (map anons/square) (reduce anons/midway)))

(defn mean [l] (/ (reduce + l) (count l)))
(mean [1 2 3 4 5 6 7])
(= 4 (mean [1 2 3 4 5 6 7]))

(defn sigma [l] (let [u (mean l)] (->> l (map #(- % u)) (map anons/square) mean Math/sqrt)))
(sigma [1 2 3 4 5])
(= (sigma [1 2 3 4 5]) (Math/sqrt 2))

(defn sigma [l]
  (let [u (mean l)]
    (->> l
         (map #(- % u))
         (map anons/square)
         mean Math/sqrt)))
