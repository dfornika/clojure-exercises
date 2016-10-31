(ns clojure-exercises.exercise-026
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 26
;;
;; Write a function which returns the first X fibonacci numbers.

(defn __
  [x]
  (loop [acc 1
         result []]
    (cond (> acc x) (lazy-seq result)
          (< acc 3) (recur (inc acc) (conj result 1))
          :else
          (recur (inc acc)
                 (conj result
                       (+ (last (butlast result))
                          (last result))))))
  )

(deftest tests
  (is (= (__ 3) '(1 1 2)))
  (is (= (__ 6) '(1 1 2 3 5 8)))
  (is (= (__ 8) '(1 1 2 3 5 8 13 21))))
