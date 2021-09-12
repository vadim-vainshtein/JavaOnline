/**
 * Задача 7: даны дроби p1/q1, p2/q2, ..., pn/qn; p и q - натуральные. Составить программу, приводящую дроби к общему знаменателю, 
 * и сортирующую их по возрастанию.
 */
 
 package algorithmization.sorting.task07;
 
 import algorithmization.sorting.task07.Fraction;
 import algorithmization.Util;
 
 import java.lang.Math;
 
 public class Main {
 	
 	public static void main(String[] args) {
 		
 		final int n = 10;

 		// Конструктор по умолчанию заполняет дроби случайными числами для удобства тестирования
 		Fraction[] fractions = new Fraction[n];
 		System.out.println("\nFractions:");
 		printFractions(fractions);
 		
 		leadToCommonDenominator(fractions);
 		System.out.println("\n\nFractions leaded to a common denominator:");
 		printFractions(fractions);
 		
 		sortFractions(fractions);
 		System.out.println("\n\nSorted fractions:");
 		printFractions(fractions);
 		
 		System.out.println("\n");
 	}
 	
 	private static void leadToCommonDenominator(Fraction[] fractions) {
 		/**
 		 * Приводит дроби fractions[] к общему знаменателю
 		 */
 		 
 		 // Последовательно вычислим НОК знаменателей 
 		 int lcm = 0;
 		 for(int i = 0; i < fractions.length; i++) {
 		 	lcm = Util.LCM(lcm, fractions[i].getDenominator());
 		 }
 		 
 		 // Приведём дроби к общему знаменателю
 		 for(int i = 0; i < fractions.length; i++) {
 			
 			int multiplier = lcm / fractions[i].getDenominator();
 			fractions[i].multiplyBoth(multiplier);
 		 }
 	}
 	
 	
 	private static void sortFractions(Fraction[] fractions) {
 		/**
 		 * Сортирует дроби, приведённые к общему знаменателю (т.е. по числителю)
 		 */
 		 
 		 int i = 0;
 		 while(i < fractions.length) {
 		 	
 		 	if(fractions[i].getNumerator() > fractions[i+1].getNumerator()) {
 		 		swapFractions(fractions[i], fractions[i+1]);
 		 		if(i > 0) i--;
 		 	}
 		 	else {
 		 		i++;
 		 	}
 		 }
 	}
 	
 	
 	private static void printFractions(Fraction[] fractions) {
 		
 		for(int i = 0; i < fractions.length - 1; i++) {
 			System.out.print(fractions[i].toString(), "; ");
 		}
 		
 		System.out.println(fractions[i].toString());
 	}
 	
 	private static void swapFractions(Fraction[] fractions, int a, int b) {
 		/**
 		 * Меняет местами две дроби в массиве
 		 */
 		 
 		 Fraction tmp = new Fraction(fractions[a].getNumerator(), fractions[a].getDenominator());
 		 fraction[a].setNumerator(fraction[b].getNumerator());
 		 fraction[a].setDenominator(fraction[b].getDenominator());
 		 fraction[b].setNumerator(tmp.getNumerator());
 		 fraction[b].setDenominator(tmp.getDenominator());
 	}
 }