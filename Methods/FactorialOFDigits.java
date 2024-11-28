package Methods;

public class FactorialOFDigits {
	public static void main(String[] args) {
		int num = 1456;
		factorialOfDigits(num);
	}
	
	public static void factorialOfDigits(int num) {
		while(num!=0) {
			int last = num%10;
			fact(last);
			num = num/10;
		}
	}
	public static void fact(int last) {
		int fact=1;
		for(int i=1;i<=last;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+last+ " is "+fact);
	}
}
