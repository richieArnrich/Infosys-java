package StaticKey;

import java.util.Scanner;

public class CalculatorDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //object creation statement
		boolean flag = true;
		while(flag) {
			System.out.println("Enter your choice");
			System.out.println("1. Add()");
			System.out.println("2. Sub()");
			System.out.println("3. Mul()");
			System.out.println("4. Div()");
			System.out.println("5. Exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter two numbers:");
				int a = sc.nextInt();
				int b= sc.nextInt();
				Calculator.add(a,b);
			}break;
			case 2:{
				System.out.println("Enter two numbers:");
				int a = sc.nextInt();
				int b= sc.nextInt();
				Calculator.sub(a, b);
			}break;
			case 3:{
				System.out.println("Enter two numbers:");
				int a = sc.nextInt();
				int b= sc.nextInt();
				Calculator.mul(a, b);
			}break;
			case 4:{
				System.out.println("Enter two numbers:");
				int a = sc.nextInt();
				int b= sc.nextInt();
				Calculator.div(a, b);
			}break;
			case 5:{
				flag = false;
			}break;
			default:{
				System.out.println("Invalid Input");
			}
			}
		}
		
	}
}
