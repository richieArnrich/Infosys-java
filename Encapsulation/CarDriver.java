package Encapsulation;

public class CarDriver {
	public static void main(String[] args) {
		Car c = new Car();
//		access car attributes directly - error
//		c.gear = 6;
		int myGear = 3;
		c.setGear(myGear);
		System.out.println(
				"Current gear: "+c.getGear());
		c.setSteering("Left");
		System.out.println(
				"Car is moving "+ 
		c.getDirection());
		c.setSteering("right");
		System.out.println(
				"Car is moving "+ 
		c.getDirection());
	}
}
