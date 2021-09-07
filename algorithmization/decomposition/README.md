Декомпозиция с использованием методов
=================

	package algorithmization.decomposition;

Задачи располагаются каждая в своём каталоге algorithmization/decomposition/task*

В решениях используются методы из специально созданного класса 

	algorithmization.Util

Задача 1
-----------------

	algorithmization.decomposition.task01.Main

*Найти НОД и НОК двух натуральных чисел*

Используются методы GCD() и LCM() из класса

	algorithmization.Util

Задача 2
-----------------
	
	algorithmization.decomposition.task02.Main
	
*Найти НОД четырёх натуральных чисел*
	
Легко показать, что НОД(a, b, c, d) = НОД (НОД(a, b), НОД(c, d)). Соответствующий метод описан в классе Main
	
	algorithmization.Util
	
Задача 3
-----------------

	algorithmization.decomposition.task03.Main

*Найти сумму правильного шестиугольника со стороной a через сумму площадей треугольников*

Методы triangleArea() и hexagonArea() для вычисления площадей треугольника и шестиугольника находятся в классе
	
	algorithmization.Util;
