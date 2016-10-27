(ns clojure-exercises.exercise-025
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 25
;;
;; Write a function which returns only the odd numbers from a sequence.

(def __
  #(filter odd? %)
  )

(deftest tests
  (is (= (__ #{1 2 3 4 5}) '(1 3 5)))
  (is (= (__ [4 2 1 6]) '(1)))
  (is (= (__ [2 2 4 6]) '()))
  (is (= (__ [1 1 1 3]) '(1 1 1 3))))
