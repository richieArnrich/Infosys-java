package WrapperClass;

import java.util.ArrayList;

public class ArrayListP1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println(al);
		al.add(1);
		al.add(2);
		al.add(13.00);
		al.add(true);
		al.add('c');
		al.add("Mango");
		System.out.println(al);
		
		System.out.println(al.get(0));
		System.out.println(al.get(5));
//		System.out.println(al.get(6)); IndexOutOfBoundsException
		al.add(2, "Frooti");
		System.out.println(al);
	}
}
