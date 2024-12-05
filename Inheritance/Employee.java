package Inheritance;

public class Employee extends Person{
	String E_id;
	long salary;
	
	Employee(String name,String address, long contact, String E_id, long salary){
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.E_id = E_id;
		this.salary = salary;
	}
	public void display() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(contact);
		System.out.println(E_id);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Gautham", "Bangalore", 
				123456789l, "Gou123", 1000);
		e1.display();
	}
}
