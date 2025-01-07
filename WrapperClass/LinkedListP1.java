package WrapperClass;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListP1 {
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add(100);
		li.add("Bangalore");
		li.add(15.44);
		System.out.println(li);
//		listiterator
		ListIterator i1 = li.listIterator();
		System.out.println("Going forward");
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("Going backward");
		while(i1.hasPrevious()) {
			System.out.println(i1.previous());
		}
	}
}
