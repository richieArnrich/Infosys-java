package WrapperClass;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		HashSet hs1 = new HashSet();
		hs1.add(1);
		hs1.add("String");
		hs1.add(13);
		hs1.add('c');
		System.out.println(hs1);
		hs1.add(13);
		System.out.println(hs1);
		
		TreeSet t1 = new TreeSet();
//		implement sorted set: always sorted in nature
		t1.add(12);
		t1.add(1);
		t1.add(2);
		t1.add(15);
		t1.add(3);
		System.out.println(t1);
	}
}
