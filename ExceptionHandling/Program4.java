package ExceptionHandling;

public class Program4 {
	public static void main(String[] args) {
		try {
			checkAge(16);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
	
	public static void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException("You are a minor and not allowed");
		}else {
			System.out.println("You are welcome to be my guest");
		}
	}
}
