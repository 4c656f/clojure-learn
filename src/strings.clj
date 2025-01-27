;; finds provided expression
(re-find #"^patter" "pattern-rest-of-the-string")
;; doesn't find provided pattern -> returns nil
(re-find #"^random" "pattern-rest-of-the-string")

;; replace pattern in a string
(clojure.string/replace "pattern-string"  #"^pattern" "replaced")
