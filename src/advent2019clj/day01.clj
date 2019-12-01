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

(defn part-1
  "...individually calculate the fuel needed for the mass of each module (your puzzle input), then add together all the fuel values."
  [file-name]
  (with-open [rdr (io/reader file-name)]
    (->> (line-seq rdr)
         (map rh/to-int)
         (map fuel-required)
         (reduce +))))
