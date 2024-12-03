package Class_Object;

public class Students {
	String name;
	int id;

	Students(String n,int i){
		name = n;
		id = i;
	}
	public void Display() {
		System.out.println("Name = "+ name + " and id = "+ id);
	}
	public static void main(String[] args) {
		Students s1 = new Students("Rahul", 20);
		s1.Display();
		Students s2 = new Students("Bheem", 24);
		s2.Display();
		Students s3 = new Students("Kalia", 20);
		s3.Display();
		Students s4 = new Students("Tom", 18);
		s4.Display();
	}
}
