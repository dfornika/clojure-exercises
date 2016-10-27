(ns clojure-exercises.exercise-007
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 7
;;
;; When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end.

(def __
  [1 2 3 4]
  )

(deftest tests
  (is (= __ (conj [1 2 3] 4)))
  (is (= __ (conj [1 2] 3 4))))
