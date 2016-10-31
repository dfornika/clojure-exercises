(ns clojure-exercises.exercise-038
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 38
;;
;; Write a function which takes a variable number of parameters and returns the maximum value.
;;
;; Restrictions (please don't use these function(s)): max, max-key

(defn __
  [& args]
  (last (sort args))
  )

(deftest tests
  (is (= (__ 1 8 3 4) 8))
  (is (= (__ 30 20) 30))
  (is (= (__ 45 67 11) 67)))
