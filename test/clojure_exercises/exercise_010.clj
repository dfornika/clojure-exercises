(ns clojure-exercises.exercise-010
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 10
;;
;; Maps store key-value pairs.  Both maps and keywords can be used as lookup functions. Commas can be used to make maps more readable, but they are not required.

(def __
  20
  )

(deftest tests
  (is (= __ ((hash-map :a 10, :b 20, :c 30) :b)))
  (is (= __ (:b {:a 10, :b 20, :c 30}))))
