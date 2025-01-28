(loop [cnt 0]
  (println cnt)
  (if (> cnt 3)
    (println "end of the loop")
    (recur (inc cnt))))

(defn custom-reduce
  ([f initial collection]
   (loop [result initial
          remaining collection] (if (empty? remaining)
                                  result
                                  (recur (f result (first remaining)) (rest remaining)))))
  ([f [head & tail]]
   (custom-reduce f head tail)))

(println (custom-reduce #(+ %1 %2) [1 2 3 4]))
