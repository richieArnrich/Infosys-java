package Methods;

public class MethodDemo {
	public static void my_method() {
		System.out.println("Hello, i am a method");
//		method declaration
//		my_method() - called method
	}
	public static void my_para_method(String name) {
		System.out.println("Hi my input is: "+ name);
	}
	public static void my_para_method2(String name, int num) {
		System.out.println("Hi my input is: "+ name+ " and "+ num);
	}
	public static void main(String[] args) {
		System.out.println("Main starts");
		my_method(); //method call statement, main() - calling method
		my_para_method("Richie");
		my_para_method2("Richie", 100);
		System.out.println("Main ends");
	}
}
