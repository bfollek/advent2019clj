(ns advent2019clj.day01-test
  (:require [clojure.test :refer :all]
            [advent2019clj.day01 :refer :all]))

(deftest test-fuel-required
  (is (= 2 (fuel-required 12)))
  (is (= 2 (fuel-required 14)))
  (is (= 654 (fuel-required 1969)))
  (is (= 33583 (fuel-required 100756))))

(deftest test-part-1
  (is (= 3246455 (part-1 "data/day01.dat"))))
