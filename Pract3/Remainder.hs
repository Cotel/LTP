module Remainder where

    remainder :: Int -> Int -> Int
    remainder d s
        | s == 0 = 0
        | d >= s = (remainder (d-s) s)
        | otherwise = d
