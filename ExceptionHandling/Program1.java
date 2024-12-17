package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args)  {
		System.out.println("Main starts");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		try {
			int x = sc.nextInt(); //input mismatch exception
			System.out.println("value of x is: "+ x);
		}catch(InputMismatchException e) {
			System.out.println("Enter valid input "+ e);
		}
		System.out.println("Main ends");
//		Thread.sleep(0);
	}
}
