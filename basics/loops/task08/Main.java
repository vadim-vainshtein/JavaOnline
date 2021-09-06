/*
 * Задача 8: Даны два числа. Определить цифры, входящие как в первое, так и во второе числа*
 */
 
 /*
  * Использование: basics.loops.task08.Main m n
  * m, n - целые
  */
  package basics.loops.task08;
  
  public class Main {
  	
  	public static void main(String[] args) {
  		
  		final int DEFAULT_M = 123456;
  		final int DEFAULT_N = 908765;
  		int m = DEFAULT_M;
  		int n = DEFAULT_N;
  		
  		try {
  			m = Integer.parseInt(args[0]);
  			n = Integer.parseInt(args[1]);
  		}
  		catch (ArrayIndexOutOfBoundsException e) {
  			System.out.print("\nNot enough arguments, using a default value\n");
  		}
  		catch (NumberFormatException e) {
  			System.out.print("\nInvalid input, using a default value\n");
  		}
  		
  		System.out.print("m = " + m + "; n = " + n + "\n\n");
		
		// Для определения цифр знак не имеет значения, так что числа для удобства берём по модулю
		if(m < 0) {
			m = -m;
		}
		
		if(n < 0) {
			n = -n;
		}
  		
  		//массивы для контроля появления цифр 0-9 в числах m и n
  		boolean[] mDigits = new boolean[10];
		boolean[] nDigits = new boolean[10];
  		
		//на каждом шаге делим число на 10, получая в виде остатка от деления цифру
		// и отмечая эти цифры в соответствующем массиве
  		int divided = m;
 		do {
  			mDigits[divided % 10] = true;
  			divided /= 10;
  		} while(divided > 0);
  		
  		divided = n;
 		do {
			nDigits[divided % 10] = true;
  			divided /= 10;
 		} while(divided > 0);
  			
  		// Посмотрим, какие цифры встретились в обоих числах:
		
		System.out.print("Common digits are:\n");
		
		for(int i = 0; i < 10; i++) {
			if(mDigits[i] && nDigits[i]) {
				System.out.print(i + "; ");
			}
		}
		
		System.out.println("");
  	}
  }
