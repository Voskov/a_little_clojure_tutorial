(ns app.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, Worl;d!"))

((fn [x] (* x x)) 5)
(def square (fn [x] (* x x)))
(square 5)

(map (fn [x] (* x x x)) [1 2 3])

(map #(* % % %) [1 2 3])

(def midway (fn [a b] (/ (+ a b) 2)))

(defn midway [a b] (/ (+ a b) 2))

(def midway #(/ (+ %1 %2) 2))

(midway 5 9)

(apply + [1 2 3])
(reduce + [1 2 3])

(reduce midway [2 3 4])
(apply midway [2 3 4])
(reduce midway 0 [2 3 4 5])

(reduce midway (map square (range 10)))
(->> (range 10) (map square) (reduce midway))
(count "nsnsns")

(defn hello
  ([] "Hello World!")
  ([a] (str "Hello, you silly " a "."))
  ([a & more] (str "Hello to this group: "
                   (apply str
                          (interpose ", " (concat (list a) more)))
                   "!")))

(hello "a" "b" "c")

(defmulti diet (fn [x] (:eater x)))
(defmethod diet :herbivore [a] (str (:name a) " eats veggies.") )
(defmethod diet :carnivore [a] (str (:name a) " eats animals.") )
(defmethod diet :default [a] (str "I don't know what " (:name a) " eats.") )

(diet {:species "deer", :name "Bambi", :age 1, :eater :herbivore})
(diet {:species "lion", :name "Simba", :age 1, :eater :carnivore})
(diet {:name "Rich Hickey"})

(take 20 (iterate inc 0))

(for [index (range 6)] index)
(map (fn [index] (* index index)) (range 6))

(= '(0 1 4 9 16 25) (map (fn [index] (* index index)) (range 6)) (for [index (range 6)] (* index index)))
(= '(0 1 4 9 16 25) (map (fn [index] (* index index)) (range 6)))
(= '(0 1 4 9 16 25) (for [index (range 6)] (* index index)))