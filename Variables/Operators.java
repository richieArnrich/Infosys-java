package Variables;

public class Operators {
	public static void main(String[] args) {
		int a =10;
		int b = 20;
//		Arithmetic operators
		System.out.println("add = "+ (a+b)); //concatenation
		System.out.println("sub = "+(b-a));
		System.out.println("div = "+ (b/a));
		System.out.println("rem = "+ (b%a));
		System.out.println("mul = "+ (a*b));
		
//		logical operators && and ||
		int c = 15; int d = 20;
		System.out.println("&& = " + ((c>a) && (c>d)));
		System.out.println("|| = "+((c>a)|| (c>d)));
		
//		print the last digit of a given number
		int num = 134;
//		output last = 4
		System.out.println(num%10);
	}
}
