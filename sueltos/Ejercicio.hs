union' :: (Eq a) => [a] -> [a] -> [a]
union' [] bs = bs
union' (a:as) bs
    | a `notElem` bs = (a:bs)
    | otherwise = a:[]

intersection' :: (Eq a) => [a] -> [a] -> [a]
intersection' [] bs = []
intersection' as bs =
    let ns = [a | a <- as, a `elem` bs] in [b | b <- bs, b `elem` as]
