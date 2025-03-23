(ns a-little-clojure-training.chapter6.risk)
(def game {:attackers 10 :defenders 10})
(def rolls [1 1 1 3 3
            1 1 6 5 1
            6 6 1 5 5
            3 4 4 5 4
            3 5 4 6 2
            3 3 6 5 4
            5 6 3 4
            4 5 2 3
            3 3 6
            6 2])
(def expected {:attackers 2 :defenders 0})

(defn parse-roll [game roll] {:attack [] :defend []} )

(defn update-game [game roll])
(ns a-little-clojure-training.chapter6.risk)

(def game {:attackers 10 :defenders 10})
