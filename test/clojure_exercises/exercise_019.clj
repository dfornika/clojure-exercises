(ns clojure-exercises.exercise-019
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 19
;;
;; Write a function which returns the last element in a sequence.
;;
;; Restrictions (please don't use these function(s)): last

(def __
  (fn [x] (first (reverse x)))
  )

(deftest tests
  (is (= (__ [1 2 3 4 5]) 5))
  (is (= (__ '(5 4 3)) 3))
  (is (= (__ ["b" "c" "d"]) "d")))
