(ns clojure-exercises.exercise-009
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 9
;;
;; When operating on a set, the conj function returns a new set with one or more keys "added".

(def __
  2
  )

(deftest tests
  (is (= #{1 2 3 4} (conj #{1 4 3} __))))
