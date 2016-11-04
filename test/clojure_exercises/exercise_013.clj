(ns clojure-exercises.exercise-013
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 13
;;
;; The rest function will return all the items of a sequence except the first.

(def __ '(20 30 40))

(deftest tests
  (is (= __ (rest [10 20 30 40]))))
