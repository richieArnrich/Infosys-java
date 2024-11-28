package Methods;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 1234;
		reverseNumber(num);
	}
	
	public static void reverseNumber(int num) {
		int reverse = 0;
		while(num!=0) {
			int last = num%10;
			reverse = reverse*10+last;
			System.out.println(reverse);
			num = num/10;
		}
		System.out.println(reverse);
	}
}
// WAP to find the sum of all digits of a number
// num: 1456 sum: 16