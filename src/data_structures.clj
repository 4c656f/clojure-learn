(ns data-structures)

(def map-brackets-def {:foo "bar"})
(def map-map-fn-def (hash-map :key "value"))

(println (get map-map-fn-def :key ))
(println (get map-brackets-def :bar "default value"))
(println (map-brackets-def :foo "default value"))
(println (:foo map-brackets-def "default value"))

(def vec ["one" "two" "three"])

(println vec)
(println get vec 0)
(println ( conj vec 0 ))

(def list-def '("one" "two" "three"))

(println list-def)
(println (nth list-def 0))

(def set-def (hash-set 0 1 2 3))

(println set-def)
(println ( contains? set-def 0 ))

