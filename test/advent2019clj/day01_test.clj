(ns advent2019clj.day01-test
  (:require [clojure.test :refer :all]
            [advent2019clj.day01 :refer :all]))

(deftest test-fuel-required
  (is (= 2 (fuel-required 12)))
  (is (= 2 (fuel-required 14)))
  (is (= 654 (fuel-required 1969)))
  (is (= 33583 (fuel-required 100756))))

(deftest test-fuel-required-meta
  (is (= 2 (fuel-required-meta 14)))
  (is (= 966 (fuel-required-meta 1969)))
  (is (= 50346 (fuel-required-meta 100756))))

(deftest test-part-1
  (is (= 3246455 (part-1 "data/day01.dat"))))

(deftest test-part-2
  (is (= 4866824 (part-2 "data/day01.dat"))))
