(ns clojure-exercises.exercise-034
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 34
;;
;; Write a function which creates a list of all integers in a given range.
;;
;; Restrictions (please don't use these function(s)): range

(defn __
  [start end]
  (loop [acc (dec end)
         result '()]
    (if (< acc start)
      result
      (recur (dec acc) (conj result acc)))))

(deftest tests
  (is (= (__ 1 4) '(1 2 3)))
  (is (= (__ -2 2) '(-2 -1 0 1)))
  (is (= (__ 5 8) '(5 6 7))))
