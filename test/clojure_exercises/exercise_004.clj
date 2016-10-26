(ns clojure-exercises.exercise-004
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 4
;;
;; Lists can be constructed with either a function or a quoted form.

;; Note: dfornika 2016-10-26: Had to cheat a bit, can't def __ to three bare keywords
(def __
  '(:a :b :c)
  )

(deftest tests
  (is (= (list :a :b :c) '(:a :b :c))))
