package ExceptionHandling;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter two numbers");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int a = num1/num2;
			System.out.println(a);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}finally {
			System.out.println("Finally executed");
			sc.close();
//			in order to close the system resources used in the program
		}
	}
}
