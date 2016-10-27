(ns clojure-exercises.exercise-014
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 14
;;
;; Clojure has many different ways to create functions.

(def __
  8
  )

(deftest tests
  (is (= __ ((fn add-five [x] (+ x 5)) 3)))
  (is (= __ ((fn [x] (+ x 5)) 3)))
  (is (= __ (#(+ % 5) 3)))
  (is (= __ ((partial + 5) 3))))
