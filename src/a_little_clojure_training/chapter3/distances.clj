(ns a-little-clojure-training.chapter3.distances)

(def points [["O" 0 0] ["A" 1 1] ["B" 1 2] ["C" 2 3] ["D" 4 5]])

(defn distance [p1 p2]
  (let [dx (- (second p1) (second p2))
        dy (- (last p1) (last p2))]
  (Math/sqrt (+ (* dx dx) (* dy dy)))))

(defn distances [points]
  (for [p1 points p2 points]
    (cond 
    (not= p1 p2) (print (first p1) "-" (first p2) (str(distance p1 p2))))))

(distance (first points) (second points))

(distances points)