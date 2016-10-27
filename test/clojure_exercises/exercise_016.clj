(ns clojure-exercises.exercise-016
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 16
;;
;; Write a function which returns a personalized greeting.

(def __
  #(str "Hello, " % "!")
  )

(deftest tests
  (is (= (__ "Dave") "Hello, Dave!"))
  (is (= (__ "Jenn") "Hello, Jenn!"))
  (is (= (__ "Rhea") "Hello, Rhea!")))
