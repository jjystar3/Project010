package ex;

public class Ex03 {

	public static void main(String[] args) {

		Calc calculator = new NewCalculator();
		System.out.println(calculator.add(10, 5));
		System.out.println(calculator.substract(10, 5));
		System.out.println(calculator.times(10, 0));
		System.out.println(calculator.divide(10, 20));
		
		
	}

}

class NewCalculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		if (num2 > 0) {
			return num1 * num2;
		} else {
			return Calc.ERROR;
		}
	}

	@Override
	public int divide(int num1, int num2) {
		if (num1 < num2) {
			return Calc.ERROR;
		} else {
			return num1 / num2;
		}
	}

}