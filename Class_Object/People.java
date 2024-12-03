package Class_Object;

public class People {
	String name;
	int age;
	String color;
	
	People(String name,int age, String color){
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public void Display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
	}
	public static void main(String[] args) {
		People p1 = new People("Sachit", 29,"fair");
		p1.Display();
	}
}
