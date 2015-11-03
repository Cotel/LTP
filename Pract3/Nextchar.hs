module Nextchar where

    import Data.Char

    nextchar :: Char -> Char
    nextchar c
        | not (isAlpha c) = c
        | c == 'Z' = 'A'
        | c == 'z' = 'a'
        | otherwise = chr ((ord c) +1)
