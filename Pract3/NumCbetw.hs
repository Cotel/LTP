module NumCbetw where

    import Data.Char

    numCbetw :: Char -> Char -> Int
    numCbetw a b
        | a == b = 0
        | otherwise = ((ord b)-1) - (ord a)
