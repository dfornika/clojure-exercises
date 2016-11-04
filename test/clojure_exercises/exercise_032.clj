(ns clojure-exercises.exercise-032
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 32
;;
;; Write a function which duplicates each element of a sequence.

(defn __
  [x]
  (apply concat (map #(repeat 2 %) x)))

(deftest tests
  (is (= (__ [1 2 3]) '(1 1 2 2 3 3)))
  (is (= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)))
  (is (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))
  (is (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))))
