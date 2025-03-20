(ns a-little-clojure-training.chapter6.maps)

(def m {"One" 1 "Two" 2})
(type m)
(get m "One")
(= 1 (get m "One"))
(get m "Two")
(= 2 get m "Two")
(= nil (get m "Three"))
(get m "Three" "none")

(m "One")
(= 1 (m "One"))
(nil? (m "three"))
(= "none" (m "three" "none"))

(keys m)
(= ["One" "Two"] (keys m))
(= [1 2] (vals m))
(contains? m "One")
(true? (contains? m "One"))
(false? (contains? m 1))

(find m "One")
(get m "One")
(type (find m "One"))
(type (get m "One"))

(first m)
(type (first m))

(key (first m))
(val (first m))
(type (key (first m)))
(type (val (first m)))

(def me (first m))
me
(type me)
(key me)
(val me)
(first me)
(second me)
(last me)

(map #(str (first %) ":" (second %)) m)
(->> m (map #(str (first %) ":" (second %))))
(map #(str (key %) ":" (val %)) m)
(assoc m "three" 3)
(m "Two")
(def temp (assoc m "three" 3))
(print temp)
(def m2 (assoc m "three" 3))
(print m2)
(dissoc m2 "three")

(update m "One" inc)
(assoc m "One" (inc (m "One")))
(print m)

:this
(type :this)
(name :this)
(type (name :this))
(keyword "this")

(= :this :this)
(= :this :that)
(= (= :this :this))
(= (= :this :that))
:this
:num5
:5num
:55
(str :this)
(prn :this)

(def mk {:one 1 :two 2})
(mk :one)
(get mk :one)
(mk :two)
(:one mk)
(:three mk)
(:three mk :none)
(mk :three :none)

(map :one [{:one 1} {:one "one"}])

