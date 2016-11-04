(ns clojure-exercises.exercise-015
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 15
;;
;; Write a function which doubles a number.

(def __ #(* 2 %))

(deftest tests
  (is (= (__ 2) 4))
  (is (= (__ 3) 6))
  (is (= (__ 11) 22))
  (is (= (__ 7) 14)))
