; fizzbuzz
(ns clojure-leetcode.q412)

(defn- convert
  [i]
  (if-let [fb (seq (concat (when (zero? (mod i 3)) "Fizz")
                           (when (zero? (mod i 5)) "Buzz")))]
    (apply str fb)
    i))
    
  
(defn run 
  [n]
  (map convert (range 1 (inc n))))