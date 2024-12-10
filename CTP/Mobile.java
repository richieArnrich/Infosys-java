package CTP;

public class Mobile {
	String brand;
	String modelName;
	String simType;
	
	Mobile(String brand){
		this.brand = brand;
		System.out.println("Constructor 1 called");
	}
	Mobile(String brand,String modelName){
//		refer to the above constructor
		this(brand); //this call statement: referring current class constructor
		System.out.println("Constructor 2 called");
		this.modelName = modelName;
	}
	Mobile(String brand,String modelName, String simType){
		this(brand,modelName);
		System.out.println("Constructor 3 called");
		this.simType = simType;
	}
	void display() {
		System.out.println(brand);
		System.out.println(modelName);
		System.out.println(simType);
	}
	
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Samsung","S22", "5G");
		m1.display();
	}
}
