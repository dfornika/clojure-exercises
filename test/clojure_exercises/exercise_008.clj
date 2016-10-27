(ns clojure-exercises.exercise-008
  (:require [clojure.test :refer :all]
            [clojure.set]))

;; 4Clojure Question 8
;;
;; Sets are collections of unique values.

(def __
  #{:a :b :c :d}
  )

(deftest tests
  (is (= __ (set '(:a :a :b :c :c :c :c :d :d))))
  (is (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))))
