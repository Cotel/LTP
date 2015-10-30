module Sumatorio where

    sumatorio :: Int -> Int -> Int -> Int
    sumatorio f a b
        | a == b = f
        | otherwise = f + (sumatorio f (a+1) b)
