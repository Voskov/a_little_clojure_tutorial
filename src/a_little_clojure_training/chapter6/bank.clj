(ns a-little-clojure-training.chapter6.bank)

(def accounts {1 {:balance 0 :name "bob"}
               2 {:balance 100 :name "bill"}})

(def transactions [{:type :deposit :account 1 :amount 100}
                   {:type :withdrawal :account 2 :amount 50}
                   {:type :interest :account 2 :rate 1/100}])

(def expected {1 {:balance 101 :name "bob"}
               2 {:balance 101/2 :name "bill"}})

(defn new-balance [accounts trans]
  (condp = (trans :type)
    :deposit (+ ((accounts (:account trans)) :balance) (:amount trans))
    :withdrawal (- ((accounts (:account trans)) :balance) (:amount trans))
    :interest (* ((accounts (:account trans)) :balance) (+ 1 (:rate trans))))
  )

(defn update-accounts [accounts transaction]
  (assoc-in accounts [(transaction :account) :balance] (new-balance accounts transaction)))
(get-in accounts [((last transactions) :account) :balance])
(update-accounts accounts (last transactions))


(defn process-transactions-reduce [accounts transactions]
  (reduce update-accounts accounts transactions)
  )

(process-transactions-reduce accounts transactions)
expected
(= expected (process-transactions-reduce accounts transactions))

(= expected (process-transactions-for accounts transactions))

(process-transactions-for accounts transactions)
(= expected (process-transactions-doseq accounts transactions))
