package Abstraction;

public abstract class GamePlay {
	abstract void run();
	abstract void brake();
	abstract void right();
	abstract void left();
	
	void demo() {
		System.out.println("I am demo()");
//		concrete methods
	}
}
