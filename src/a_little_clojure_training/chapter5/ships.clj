(ns a-little-clojure-training.chapter5.ships)

(def speeds [[1 1] [0 0] [2 0] [-1 2] [-1 -1]])

(defn move [location vector] (mapv + location vector))

(= [1 2] (move [0 0] [1 2]))
(= [4 6] (move [1 2] [3 4]))

(defn calculate_position_vector [location accumulated_speed speeds]
  (if (empty? speeds) [location accumulated_speed]
                      (let [new_speed (mapv + accumulated_speed (first speeds))
                            new_location (move location new_speed)]
                        (recur new_location new_speed (rest speeds)))))


(= [[0 0] [0 0]] (calculate_position_vector [0 0] [0 0] []))
(= [[1 1] [0 0]] (calculate_position_vector [1 1] [0 0] []))
(= [[1 1] [1 1]] (calculate_position_vector [0 0] [0 0] [[1 1]]))
(= [[1 1] [1 1]] (calculate_position_vector [0 0] [0 0] [[1 1]]))
(= [[4 4] [3 3]] (calculate_position_vector [0 0] [0 0] [[1 1] [2 2]]))


(= [[8 8] [1 2]] (calculate_position_vector [0 0] [0 0] speeds))