package ex;

public class Quiz01 {

	public static void main(String[] args) {
		
		Calc calc = new Calculator();
		
		if(calc instanceof Calculator) {
			Calculator calculator = (Calculator)calc;
			calculator.showInfo();
		}

	}

}
