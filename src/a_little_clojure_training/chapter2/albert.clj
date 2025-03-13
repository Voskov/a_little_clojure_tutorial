(ns a-little-clojure-training.chapter2.albert)

(defn energy [mass]
  (let [c 299792458] 
    (* mass c c)))

(= 89875517873681764 (energy 1))
(= 179751035747363528 (energy 2))
(= 0 (energy 0))