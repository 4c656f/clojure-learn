(ns control-flow)

(defn error_message
  [error]
  (str "base error message "
       (if (= error :mild)
         "mild err"
         "non mild err")))

(error_message :mild)

