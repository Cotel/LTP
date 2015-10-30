module Lapyear where

    -- Seguramente sea mejorable
    lapyear :: Int -> Bool
    lapyear a
        | a `mod` 400 == 0 = True
        | a `mod` 100 == 0 = False
        | a `mod` 4 == 0 = True
        | otherwise = False

    -- Igualmente
    daysAmonth :: Int -> Int -> Int
    daysAmonth m a = case m of 1 -> 31
                               2 -> if (lapyear a) then 29 else 28
                               3 -> 31
                               4 -> 30
                               5 -> 31
                               6 -> 30
                               7 -> 31
                               8 -> 31
                               9 -> 30
                               10 -> 31
                               11 -> 30
                               12 -> 31
