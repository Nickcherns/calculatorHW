package calculatorHW;

public class Calculator {
	public static int value1 = 10;
	public static int value2 = 5;
	public static int total;
	
	public static int add(int num1, int num2) {
		total = num1 + num2;
		return total;
	}
	
	public static int subtract(int num1, int num2) {
		total = num1 - num2;	
		return total;
	}
	
	public static int multiply(int num1, int num2) {
		total = num1 * num2;
		return total;
	}
	
	public static int divide(int num1, int num2) {
		total = num1 / num2;
		return total;
	}
	
	public static int square(int num1) {
		total = num1 * num1;
		return total;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Value #1: " + value1);
		System.out.println("Value #2: " + value2);
		System.out.println("Addition: " + add(value1, value2)); 
		System.out.println("Subtraction: " + subtract(value1, value2));
		System.out.println("Multiplication: " + multiply(value1, value2));
		System.out.println("Division: " + divide(value1, value2));
		System.out.println("Value #1 Squared: " + square(value1));
		System.out.println("Value #2 Squared: " + square(value2));
		
		
	}

}
