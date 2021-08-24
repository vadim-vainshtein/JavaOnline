/*
 * класс Line описывает линейную функцию y = ax + b;
 * фунция задаётся либо константами a и b (первый конструктор), либо двумя точками на плоскости (второй конструктор)
 * метод hasPoint определяет, принадлежит ли точка данной линии
 */

package basics.branching.task03.line;

public class Line {
    
    private double a, b;
    
    public Line(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public Line(double x1, double y1, double x2, double y2) {
        a = (y1 - y2) / (x1 - x2);
        b = y1 - a*x1;
    }
    
    Line() {
    }
    
    public void setA(double value) {
        a = value;
    }
 
    public double getA() {
        return a;
    }
    
    public void setB(double value) {
        b = value;
    }
     
    public double getB() {
        return b;
    }
    
    public boolean hasPoint(double x, double y) {
        
        if(x*a + b == y) {
            return true;
        }
        else {
            return false;
        }
    }
}
