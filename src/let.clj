(let [bindedName 0] (println bindedName))

(def fruits ["apple" "orange" "strawberry"])
;; destrcture vector to let binding
(let [[apple & rest] fruits] (println apple rest))