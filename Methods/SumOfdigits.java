package Methods;

public class SumOfdigits {
	public static void main(String[] args) {
		int num = 1456;
		sumOfDigits(num);
	}
	
	public static void sumOfDigits(int num) {
		int sum = 0;
		while(num!=0) {
			int last = num%10;
			sum = sum + last;
			num = num/10;
		}
		System.out.println(sum);
	}
}