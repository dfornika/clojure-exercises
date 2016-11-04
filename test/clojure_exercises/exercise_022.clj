(ns clojure-exercises.exercise-022
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 22
;;
;; Write a function which returns the total number of elements in a sequence.
;;
;; Restrictions (please don't use these function(s)): count

(defn __
  [x]
  (reduce (fn [a b] (inc a)) 0 x))

(deftest tests
  (is (= (__ '(1 2 3 3 1)) 5))
  (is (= (__ "Hello World") 11))
  (is (= (__ [[1 2] [3 4] [5 6]]) 3))
  (is (= (__ '(13)) 1))
  (is (= (__ '(:a :b :c)) 3)))
