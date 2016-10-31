(ns clojure-exercises.exercise-029
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 29
;;
;; Write a function which takes a string and returns a new string containing only the capital letters.

(defn __
  [x]
  (clojure.string/join "" (re-seq #"[A-Z]" x))
  )

(deftest tests
  (is (= (__ "HeLlO, WoRlD!") "HLOWRD"))
  (is (empty? (__ "nothing")))
  (is (= (__ "$#A(*&987Zf") "AZ")))
