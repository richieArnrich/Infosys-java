package ConditionStatement;

public class Nested_if_else {
	public static void main(String[] args) {
		int num1 = 25;
		int num2 = 15;
		
		if(num1<num2) {
			if(num1>5) {
				System.out.println("num1 is less than num2 but greater than 5");
			}else {
				System.out.println("num1 is less than num2 but not greater than 5");
			}
		}else {
			System.out.println("num1 is not less than num2");
		}
	}
}
