(ns clojure-exercises.exercise-020
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 20
;;
;; Write a function which returns the second to last element from a sequence.

(defn __
  [x]
  (first (rest (reverse x)))))

(deftest tests
  (is (= (__ (list 1 2 3 4 5)) 4))
  (is (= (__ ["a" "b" "c"]) "b"))
  (is (= (__ [[1 2] [3 4]]) [1 2])))
