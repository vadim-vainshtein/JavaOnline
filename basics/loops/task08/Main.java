/*
 * Задача 8: Даны два числа. Определить цифры, входящие как в первое, так и во второе числа*
 */
 
 /*
  * Использование: basics.loops.task08.Main m n
  * m, n - целые
  */
//  package basics.loops.task08;
  
  import java.util.ArrayList;
  
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
  		
  		ArrayList<Byte> mDigits = new ArrayList();
  		ArrayList<Byte> nDigits = new ArrayList();
  		
  		int divided = m;
 		do {
  			mDigits.add((byte)(divided % 10));
  			divided /= 10;
  		} while(divided > 0);
  		
  		divided = n;
 		do {
  			nDigits.add((byte)(divided % 10));
  			divided /= 10;
 		} while(divided > 0);
  			
  		System.out.println(mDigits);
  		System.out.println(nDigits);
  	}
  }