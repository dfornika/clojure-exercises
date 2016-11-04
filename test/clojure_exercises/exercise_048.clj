(ns clojure-exercises.exercise-048
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 48
;;
;; The some function takes a predicate function and a collection.  It returns the first logical true value of (predicate x) where x is an item in the collection.

(def __ 6)

(deftest tests
  (is (= __ (some #{2 7 6} [5 6 7 8])))
  (is (= __ (some #(when (even? %) %) [5 6 7 8]))))
