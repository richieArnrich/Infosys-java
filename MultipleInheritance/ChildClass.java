package MultipleInheritance;

public class ChildClass implements ClassA,ClassB{
	public void Print() {
		System.out.println("Print is overrridden by child class");
	}
	
	public void secondFunc() {
		System.out.println("Second func which is in B is overrriddent");
	}
	public static void main(String[] args) {
		ChildClass c1 = new ChildClass();
		c1.Print();
		c1.secondFunc();
	}
}
