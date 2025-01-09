package WrapperClass;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		ArrayDeque q1 = new ArrayDeque();
		q1.add(12);
		q1.add(13.66);
		q1.add(true);
		q1.add("String");
		System.out.println("Before remove");
		System.out.println(q1);
		
		q1.remove();
		System.out.println("After remove");
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
		
		System.out.println(q1.peek());
		System.out.println(q1);
		
		System.out.println(q1.contains("String"));
	}
}
