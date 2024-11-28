package ConditionStatement;

public class EvenOdd {
	public static void main(String[] args) {
		int num = 9;
		int result = (num/2)*2;
		if(result == num) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
}
