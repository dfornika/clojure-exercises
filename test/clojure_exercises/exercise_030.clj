(ns clojure-exercises.exercise-030
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 30
;;
;; Write a function which removes consecutive duplicates from a sequence.

(defn __
  [x]
  (reduce
   #(if (not= (last %1) %2)
      (conj %1 %2)) [(first x)] (rest x)))

(deftest tests
  (is (= (apply str (__ "Leeeeeerrroyyy")) "Leroy"))
  (is (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
  (is (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))))
