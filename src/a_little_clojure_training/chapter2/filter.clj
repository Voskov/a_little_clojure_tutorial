(ns a-little-clojure-training.chapter2.filter)


(defn pos-neg [numbers]
 (concat
  (filter pos? numbers)
  (filter zero? numbers)
  (filter  neg? numbers)))

(pos-neg [6 -1 0 4 -2 0])

(= [6 4 0 0 -1 -2] (pos-neg [6 -1 0 4 -2 0]))