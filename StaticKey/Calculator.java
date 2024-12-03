package StaticKey;

public class Calculator {
//	add,sub,mul,div
	static {
		System.out.println("Calculator class loaded");
	}
	public static void add(int a,int b) {
		int result = a+b;
		System.out.println(result);
	}
	public static void sub(int a,int b) {
		int result = a-b;
		System.out.println(result);
	}
	public static void mul(int a, int b) {
		int result = a*b;
		System.out.println(result);
	}
	public static void div(int a, int b) {
		int result = a/b;
		System.out.println(result);
	}
}
