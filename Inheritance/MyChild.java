package Inheritance;

public class MyChild extends MyParent{
	int age;
	String color;
	
	public static void main(String[] args) {
		MyChild c = new MyChild();
		c.name = "Adhoora";
		c.id = "Adh18";
		c.age = 20;
		c.color = "Wheatish";
		
		System.out.println(c.name);
		System.out.println(c.id);
		System.out.println(c.age);
		System.out.println(c.color);
	}
}
