import Data.Char

type Fecha = (Int, Int, Int)
type Anyos = Int

ordena :: Int -> Int -> (Int, Int)
ordena x y = if x>y then (x,y) else (y,x)

siglet :: Char -> Char
siglet x
	| not (isAlpha x) = x
	| x=='z' = 'a'
	| x=='Z' = 'A'
	| otherwise = chr((ord x)+1)


third (_, _, x) = x	

calcularEdad :: Fecha -> Fecha -> Anyos
calcularEdad x y = (third y) - (third x)

sigma :: Int -> Int -> Int -> Int
sigma f a b
	| a < b = f + (sigma f (a+1) b)
	| otherwise = f 

pi' :: Int -> Int -> Int -> Int
pi' f a b
	| a <= b = f * (pi' f (a+1) b)
	| otherwise = f
