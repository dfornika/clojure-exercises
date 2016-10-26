(ns clojure-exercises.exercise-005
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 5
;;
;; <p>When operating on a list, the conj function will return a new list with one or more items "added" to the front.</p>
;;
;; <p>Note that there are two test cases, but you are expected to supply only one answer, which will cause all the tests to pass.</p>

(def __
  '(1 2 3 4)
  )

(deftest tests
  (is (= __ (conj '(2 3 4) 1)))
  (is (= __ (conj '(3 4) 2 1))))
