/*

класс Triangle описывает треугольник. По двум углам методы isTringle и isRight проверяют,
существует ли такой треугольник, и является ли он прямоугольным

*/

package basics.branching.task01.triangle;

public class Triangle {

	private int alpha, beta, gamma;

	public void setAlpha(int value) {
		alpha = value;
		gamma = 180 - alpha - beta;
	}

	public void setBeta(int value) {
		beta = value;
		gamma = 180 - alpha - beta;
	}

	public int getAlpha() {
		return alpha;
	}

	public int getBeta() {
		return beta;
	}

	public int getGamma() {
		return gamma;
	}

	public boolean isTriangle() {
		if(gamma > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean isRight() {
		if(alpha == 90 || beta == 90 || gamma == 90) {
			return true;
		}
		else {
			return false;
		}
	}
}