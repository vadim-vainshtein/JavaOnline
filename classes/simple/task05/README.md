Task 5
-----

Опишите класс, реализующий десятичный счётчик, который может увеличивать или уменьшать своё значение на единицу в заданном диапазоне. Предусмотрите инициализацию счётчика значениями по умолчанию и произвольными значениями. Счётчик имеет методы увеличения и уменьшения состояния, получения текущего состояния. Написать код, демонстрирующий возможности класса.

Решение
-----

класс счётчик:

	class Counter {

		Counter();
		Counter(min, max, value);
		
		getValue();
		
		increase() throws IllegalStateException;
		decrease() throws IllegalStateException;
	}

Files:

Counter.java - класс счётчика
Main.java - пример использования
