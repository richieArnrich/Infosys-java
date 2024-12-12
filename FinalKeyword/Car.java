package FinalKeyword;

public class Car implements Vehicle{
	@Override
	public void run() {
		System.out.println("Car goes forward");
	}
	@Override
	public void stop() {
		System.out.println("Car slows down and stops");
		
	}
	@Override
	public void left() {
		System.out.println("Car goes left");
		
	}
	@Override
	public void right() {
		System.out.println("Car goes right");
		
	}

}
