package Class_Object;

public class Employees {
	String name;
	String id;
	
	public static void main(String[] args) {
//		create object for Employees class
		Employees e1 = new Employees();
		System.out.println(e1.name);
		System.out.println(e1.id);
		e1.name = "Rajath";
		e1.id = "Raj12E1";
		System.out.println(e1.name);
		System.out.println(e1.id);
	}
}
