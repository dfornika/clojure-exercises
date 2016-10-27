(ns clojure-exercises.exercise-023
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 23
;;
;; Write a function which reverses a sequence.
;;
;; Restrictions (please don't use these function(s)): reverse, rseq

(def __
  #(reduce conj '() %)
  )

(deftest tests
  (is (= (__ [1 2 3 4 5]) [5 4 3 2 1]))
  (is (= (__ (sorted-set 5 7 2 7)) '(7 5 2)))
  (is (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])))
