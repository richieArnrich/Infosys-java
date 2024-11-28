package StaticKey;

public class StaticVar {
	static int staticVar = 500;
	public static void main(String[] args) {
//		local variable
		int localVar = 100;
		System.out.println("variable inside main(): "+localVar);
		System.out.println("Static var inside main(): "+staticVar);
		demo();
		System.out.println("Static variable inside after update main(): "+staticVar);
	}
	
	public static void demo() {
//		System.out.println("variable inside demo(): "+localVar);
		System.out.println("Static variable inside demo(): "+staticVar);
		staticVar = staticVar + 1580;
		System.out.println("Static variable inside after update demo(): "+staticVar);
	}
}
