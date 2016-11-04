(ns clojure-exercises.exercise-021
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 21
;;
;; Write a function which returns the Nth element from a sequence.
;;
;; Restrictions (please don't use these function(s)): nth

(defn __
  [coll index]
  (first (drop index coll)))

(deftest tests
  (is (= (__ '(4 5 6 7) 2) 6))
  (is (= (__ [:a :b :c] 0) :a))
  (is (= (__ [1 2 3 4] 1) 2))
  (is (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])))
