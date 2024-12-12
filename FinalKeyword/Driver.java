package FinalKeyword;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your vehicle 1: Car 2: Bike");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			Car c1 = new Car();
			c1.run();
			c1.stop();
			c1.left();
			c1.right();
		}break;
		case 2:{
			Bike b1 = new Bike();
			b1.run();
			b1.stop();
			b1.left();
			b1.right();
		}break;
		default:{
			System.out.println("Invalid input");
		}
		}
		
	}
}
