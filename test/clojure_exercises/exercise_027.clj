(ns clojure-exercises.exercise-027
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 27
;;
;; Write a function which returns true if the given sequence is a palindrome.<br/><br>
;;
;; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)

(defn __
  [x]
  (= (reverse x)
     (reverse (reverse x))))

(deftest tests
  (is (false? (__ '(1 2 3 4 5))))
  (is (true? (__ "racecar")))
  (is (true? (__ [:foo :bar :foo])))
  (is (true? (__ '(1 1 3 3 1 1))))
  (is (false? (__ '(:a :b :c)))))
