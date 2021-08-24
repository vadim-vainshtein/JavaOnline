/*
 * Задача 4: проверить, поместится ли кирпич с размерами x,y,z в отверстие с размерами A,B
 */

package basics.branching.task04;

public class Task04 {
    
    public static void main(String[] args) {
        double x, y, z;
        double A, B;
           
        A = Double.parseDouble(args[0]);
        B = Double.parseDouble(args[1]);
        x = Double.parseDouble(args[2]);
        y = Double.parseDouble(args[3]);
        z = Double.parseDouble(args[4]);
        
        // Кирпич поместится в отверстие?
        if(brickFits(A, B, x, y, z)) {
			System.out.println("Brick fits into the opening");
		}
		else {
			System.out.println("Brick doesn't fit into the opening");
		}
    }
        
    private static boolean brickFits(double A, double B, double x, double y, double z) {

		double tmp;
		
		//отсортируем размеры кирпича и отверстия по возрастанию для удобства проверки
		if(x > z) {
			tmp = z;
			z = x;
			x = tmp;
		}
		
		if(y > z) {
			tmp = z;
			z = y;
			y = tmp;
		}
		else if(y < x) {
			tmp = x;
			x = y;
			y = tmp;
		}
				
		if(A > B) {
			tmp = A;
			A = B;
			B = tmp;
		}
		
		if((x < A) && (y < B)) {
			return true;
		}
		else {
			return false;
		}
	}
}
