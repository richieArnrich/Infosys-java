package ExceptionHandling;

public class Program2 {
	public static void main(String[] args) {
		try {
			Division(10,0);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
	}
	public static void Division(int a,int b) {
		int result = a/b;
		System.out.println(result);
	}
}
