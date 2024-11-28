package ConditionStatement;

public class Else_if_ladder {
	public static void main(String[] args) {
		int a = 50;
		int b = 15;
		int c = 5;
		
		if(a>b && a>c) {
			System.out.println(a+" is greatest");
		}else if(b>c && b>a) {
			System.out.println(b+ " is greatest");
		}else {
			System.out.println(c+" is greatest");
		}
	}
}
