module Factorial where

    fact :: Integer -> Integer
    fact 0 = 1
    fact n = n * (fact (n-1))

    sumFacts :: Integer -> Integer
    sumFacts 0 = (fact 0)
    sumFacts n = (fact n) + (sumFacts (n-1))
