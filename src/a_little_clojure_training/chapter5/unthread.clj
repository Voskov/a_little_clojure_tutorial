(ns a-little-clojure-training.chapter5.unthread
  (:require [a-little-clojure-training.chapter5.anons :as anons]
            [a-little-clojure-training.chapter5.threading :as threading]))

(defn sigma_threaded [l]
  (let [u (threading/mean l)]
    (->> l
         (map #(- % u))
         (map anons/square)
         threading/mean Math/sqrt)))

(defn sigma [l]
  (let [u (threading/mean l)]
       (Math/sqrt
         (threading/mean
           (map anons/square
                (map
                  (fn [x]
                    (- x u)) l))))))
(def l [1 2 3 4 5])
(= (sigma_threaded l) (sigma l))