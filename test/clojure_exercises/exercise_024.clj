(ns clojure-exercises.exercise-024
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 24
;;
;; Write a function which returns the sum of a sequence of numbers.

(defn __
  [x]
  (reduce + 0 x))

(deftest tests
  (is (= (__ [1 2 3]) 6))
  (is (= (__ (list 0 -2 5 5)) 8))
  (is (= (__ #{4 2 1}) 7))
  (is (= (__ '(0 0 -1)) -1))
  (is (= (__ '(1 10 3)) 14)))
