package Methods;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num = 153;
		int orgNum = num;
		int noOfDigits = 0;
		while(num!=0) {
			num = num/10;
			noOfDigits++;
		}
		System.out.println("No of digits: "+ noOfDigits);
		takeLast(orgNum, noOfDigits);
	}
	
	public static void takeLast(int orgNum, int noOfDigits) {
		int num = orgNum;
		int sum = 0;
		while(num!=0) {
			int last = num%10;
			int pow = power(last, noOfDigits);
			sum = sum + pow;
			num= num/10;
		}
		System.out.println("Sum is : "+ sum);
		if(sum == orgNum) {
			System.out.println("It is armstrong number");
		}else {
			System.out.println("It is not an armstrong number");
		}
	}
	public static int power(int last, int noOfDigits) {
		int power = 1;
		for(int i = 1; i<=noOfDigits; i++) {
			power = power*last;
		}
		return power;
	}
}
