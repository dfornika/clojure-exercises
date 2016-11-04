(ns clojure-exercises.exercise-006
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 6
;;
;; Vectors can be constructed several ways.  You can compare them with lists.
;;
;; <br/><br/><b>Note</b>: the brackets [] surrounding the blanks __ are part of the test case.

;; Note: dfornika 2016-10-26: Had to cheat a bit, can't def __ to three bare keywords
(def __ [:a :b :c])

(deftest tests
  (is (= __ (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))))
