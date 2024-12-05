package Encapsulation;

public class Car {
	private int gear;
	private int accelarator;
	private String steering;
	private String brake;
	
	public void setGear(int g) {
		gear = g;
		System.out.println("Gears applied");
	}
	public int getGear() {
		return this.gear;
	}
	public void setSteering(String direction) {
		this.steering = direction;
		System.out.println("direction applied");
	}
	public String getDirection() {
		return this.steering;
	}
}
