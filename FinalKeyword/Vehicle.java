package FinalKeyword;

public interface Vehicle {
	void run();
	void stop();
	void left();
	void right();
	
//	in interface the non-static functions which I create will always be abstract
//	in nature
	static void demo() {
		System.out.println("I am static demo()");
		System.out.println("static methods can have a method body whereas"
				+ "non-static methods cannot in an interface");
	}
}
