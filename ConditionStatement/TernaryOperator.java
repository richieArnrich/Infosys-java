package ConditionStatement;

public class TernaryOperator {
	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 20;
		
		String result = (num1>num2)?"num 1 is greater":"num2 is greater";
		System.out.println(result);
		
		int result2 = (num1>num2)?num1:num2;
		System.out.println(result2);
	}
}
