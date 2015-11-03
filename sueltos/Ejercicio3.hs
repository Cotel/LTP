type Point = (Float, Float)
type Path = [Point]

-- Funcion que devuelve la posicion de un elemento en una lista
position :: (Eq a) => a -> [a] -> Int
position a [] = 0
position a as = head [ pos | (a', pos) <- zip as [1..], a' == a]

-- Definir una funcion que calcule la longitud de un camino
pathLength :: Path -> Float
pathLength [] = 0
pathLength p = sum' [distance p q | (p,q) <- zip (init p) (tail p)]

sum' :: [Float] -> Float
sum' [] = 0.0
sum' (x:xs) = x + sum' xs

distance :: Point -> Point -> Float
distance (p1,p2) (q1,q2) = sqrt( ((p1 - q1)*(p1 - q1)) + ((p2 - q2)*(p2 - q2)) )

-- Definir una funcion que elimina los duplicados adyacentes (Parece que no funciona del todo bien)
elimDumps :: [Int] -> [Int]
elimDumps (x:y:xs)
	| x == y = elimDumps(y:xs)
	| otherwise = x:elimDumps(y:xs)

-- Funcion que devuelve True si al menos un elemento de la lista cumple p
-- any' (>3) [1,2,3,4,1,2,12] -> True
any' :: (Eq a) => (a -> Bool) -> [a] -> Bool
any' p xs = if length [ x | x <- xs, p x] >= 1 then True else False

-- Funcion que devuelve True si todos los elementos de la lista cumplen p
-- all' (>3) [1,2,3,4,1,2,12] -> False
all' :: (Eq a) => (a -> Bool) -> [a] -> Bool
all' p xs = if length [ x | x <- xs, p x] == length xs then True else False


















 