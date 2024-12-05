package Inheritance;

public class BMW extends Car{
	int topSpeed;
	int accelaration;
	
	BMW(String name,String color,int wheels
			,int topSpeed,int accelaration){
		super(name,color,wheels);
		this.topSpeed = topSpeed;
		this.accelaration = accelaration;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(wheels);
		System.out.println(topSpeed);
		System.out.println(accelaration);
	}
	
	public static void main(String[] args) {
		BMW b1 = new BMW("BMW M5", "Navy Blue",4,200,50);
		b1.display();
	}
}
