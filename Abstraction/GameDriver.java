package Abstraction;

public class GameDriver {
	public static void main(String[] args) {
		GameImplementation gi = new GameImplementation();
		gi.run();
		gi.brake();
		gi.right();
		gi.left();
	}
}
