package WrapperClass;

import java.util.ArrayList;

public class ArrayListP2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(); //Generic
		al.add(12);
		al.add(16);
		System.out.println(al);
		for(Integer value: al) {
			System.out.println(value);
		}
	}
}
