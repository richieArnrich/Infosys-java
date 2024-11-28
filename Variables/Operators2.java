package Variables;

public class Operators2 {
	public static void main(String[] args) {
		int dividend = 0;
		int divisor = 3;
		int quotient = 7;
		int remainder = 2;
		dividend = divisor*quotient+remainder;
		System.out.println(dividend);
		
		int x = 5;
		int y = 8;
		int num = x*10+y;
		System.out.println("two digit= "+num);
		
		int n1 = 325;
		int n2 = 257;
		x = n1%100;
		y = n2%10;
		int threeDigit = x*10 + y;
		System.out.println("three digit = "+ threeDigit);
	}
}
