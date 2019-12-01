(ns advent2019clj.day01
  "Advent 2019 Day 1"
  (:require [clojure.java.io :as io]
            [clojure.string :as str]
            [rabbithole.core :as rh]))

(defn fuel-required
  "...to find the fuel required for a module, take its mass, divide by three, round down, and subtract 2."
  [mass]
  (-> mass
      (quot 3)
      (- 2)))

(defn fuel-required-meta
  "So, for each module mass, calculate its fuel and add it to the total. Then, treat the fuel amount you just calculated as the input mass and repeat the process, continuing until a fuel requirement is zero or negative."
  [mass]
  (->> mass
       (iterate fuel-required)
       (take-while #(< 0 %))
       rest ; Drop the mass we started with
       (reduce +)))

(defn calc-fuel
  "The only difference between part-1 and part-2 is the function we use to calculate fuel."
  [file-name fuel-func]
  (with-open [rdr (io/reader file-name)]
    (->> (line-seq rdr)
         (map rh/to-int)
         (map fuel-func)
         (reduce +))))

(defn part-1
  "...individually calculate the fuel needed for the mass of each module (your puzzle input), then add together all the fuel values."
  [file-name]
  (calc-fuel file-name fuel-required))

(defn part-2
  "What is the sum of the fuel requirements for all of the modules on your spacecraft when also taking into account the mass of the added fuel? (Calculate the fuel requirements for each module separately, then add them all up at the end.)"
  [file-name]
  (calc-fuel file-name fuel-required-meta))
