package WrapperClass;

public class Item {
	String name;
	int price;
	
	Item(String name,int price){
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return this.name + " "+ this.price;
	}
}
