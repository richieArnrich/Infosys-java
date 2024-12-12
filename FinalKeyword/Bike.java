package FinalKeyword;

public class Bike implements Vehicle{
	@Override
	public void run() {
		System.out.println("Bike runs forward");
	}
	@Override
	public void stop() {
		System.out.println("Bike slows down and stops");
	}
	@Override
	public void left() {
		System.out.println("Bike turns left");
	}
	@Override
	public void right() {
		System.out.println("Bike turns right");
	}

}
