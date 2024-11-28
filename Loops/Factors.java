package Loops;

public class Factors {
	public static void main(String[] args) {
		int num = 5;
//		1,2,3,4,5,6
		int count = 0;
		int i = 1;
		while(i<=num) {
			if(num%i == 0) {
				System.out.println(i);
				count++;
			}
			i++;
		}
		System.out.println("No of factors: "+ count);
		if(count == 2) {
			System.out.println("It is a prime number");
		}else {
			System.out.println("It is not a prime number");
		}
	}
}
