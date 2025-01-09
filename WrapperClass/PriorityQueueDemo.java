package WrapperClass;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> q1 = new PriorityQueue<Integer>();
		q1.add(12);
		q1.add(13);
		q1.add(1);
		q1.add(16);
		q1.add(14);
		q1.add(15);
		q1.add(20);
		
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
//		O(1)
	}
}
