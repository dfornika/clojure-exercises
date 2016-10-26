(ns clojure-exercises.exercise-001.core-test
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 1
;;
;; This is a clojure form.  Enter a value which will make the form evaluate to true.  Don't over think it!  If you are confused, see the <a href='/directions'>getting started</a> page.  Hint: true is equal to true.

(def __
  true
  )

(deftest tests
  (is (= __ true)))
