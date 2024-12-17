package ExceptionHandling;

public class Program3 {
	public static void main(String[] args) {
		try {
			Division(10, 0);
		}catch(ArithmeticException e) {
			System.out.println("Do not divide by 0 " +e);
		}
		
	}
	public static void Division(int a, int b) throws ArithmeticException {
//		Division() is not handling the exception it is throwing back to the main()
//		throws keyword means that it is throwing back the exception the
//		calling method
		int result = a/b;
		System.out.println(result);
	}
}
