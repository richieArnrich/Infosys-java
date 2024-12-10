package RTP;

public class Child extends Parent{
	void House() {
		System.out.println("Child "
				+ "paints the house "
				+ "purple");
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.House();
	}
}
