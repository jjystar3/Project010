package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		// 인터페이스는 객체를 생성할 수 없음!
//		Calc calc = new Calc();
		
		Calculator calculator = new Calculator();
		int result = calculator.add(10, 5);
		System.out.println(result);
		
		System.out.println(calculator.substract(10, 5));
		System.out.println(calculator.times(10, 5));
		System.out.println(calculator.divide(10, 5));
	}

}

class Calculator implements Calc {

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
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다");
	}
	
}