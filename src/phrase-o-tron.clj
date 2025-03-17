(ns phrase-o-tron)

(def adjectives  ["web-scale" "streaming" "distributed" "mobile-first" "turn-key" "climate-friendly"])
(def services    ["sneezing" "laundry" "napping" "chewing" "socializing"])
(def descriptors ["on the blockchain" "using AI" "in the cloud" "for the metaverse" "as a service"])

(defn vos []
  (let [adj (rand-nth adjectives)
        srv (rand-nth services)
        des (rand-nth descriptors)]
    (println adj srv des)))

(vos)