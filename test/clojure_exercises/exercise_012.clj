(ns clojure-exercises.exercise-012
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 12
;;
;; All Clojure collections support sequencing.  You can operate on sequences with functions like first, second, and last.

(def __
  3
  )

(deftest tests
  (is (= __ (first '(3 2 1))))
  (is (= __ (second [2 3 4])))
  (is (= __ (last (list 1 2 3)))))
