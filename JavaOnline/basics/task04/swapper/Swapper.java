/*
	Класс Swapper содержит число типа double от -999.999 до 999.999,
	и может при момощи метода swap менять целую и дробную часть местами
*/

package basics.task04.swapper;

public class Swapper {
	
	private double data;
	
	public void setData(double value) {
		if (value > 999.999 || value < -999.999) {
			System.err.println("Swapper: value " + value + " out of range. Setting to 0.0");
			data = 0.0;
		}
		else
			data = value;
	}
	
	public double getData() {
		return data;
	}
	
	//метод меняет целую и дробную части data местами
	public void swap () {
		int whole = (int)data;
		//если получать дробную часть вычитанием целой из числа,
		//появляются ошибки, связанные с округлением, 
		//поэтому домножаем всё на 1000, чтобы работать с целочисленным вычитанием
		double fractional = (data*1000 - whole*1000) / 1000;
		data = (int)(fractional*1000) + (double)whole/1000.0;
	}
	
	public void printData() {
		System.out.print(data);
	}
}