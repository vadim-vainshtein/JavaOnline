/*
Задача 5: Вычислить значение функции F(x) = (x<=3) ? x^2 - 3x + 9 : 1 / (x^3+6)
*/

package basics.branching.task05;

public class Task05 {
    public static void main(String[] args) {
        
        double x = Double.parseDouble(args[0]);
        System.out.println(F(x));
    }

    private static double F(double x) {
        double result;
        result = (x <= 3) ? (x*x - 3*x + 9) : (x*x*x + 6);
        return result;
    }
}