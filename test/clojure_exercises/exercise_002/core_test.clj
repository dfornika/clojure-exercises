(ns clojure-exercises.exercise-002.core-test
  (:require [clojure.test :refer :all]))

;; 4Clojure Question 2
;;
;; <p>If you are not familiar with <a href='http://en.wikipedia.org/wiki/Polish_notation'>polish notation</a>, simple arithmetic might seem confusing.</p><p><strong>Note:</strong> Enter only enough to fill in the blank (in this case, a single number) - do not retype the whole problem.</p>

(def __
  4
  )

(deftest tests
  (is (= (- 10 (* 2 3)) __)))

