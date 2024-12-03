package StaticKey;

public class StaticBlocks {
	static int y = 500; //only created outside the function
	static {
//		to provide start-up instructions
		int x = 100; //local variables
		System.out.println(x);
		System.out.println(y);
		System.out.println("Static block for my class");
		for(int i = 0; i<5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		System.out.println("Main function starts");
		MyFunc();
		System.out.println("Main ends");
	}
	public static void MyFunc() {
		System.out.println("My function");
		
	}
}
