(ns clojure-exercises.exercise-003
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 3
;;
;; Clojure strings are Java strings.  This means that you can use any of the Java string methods on Clojure strings.

(def __ "HELLO WORLD")

(deftest tests
  (is (= __ (.toUpperCase "hello world"))))
