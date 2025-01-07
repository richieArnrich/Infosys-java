package WrapperClass;

import java.util.ArrayList;

public class ArrayListP3 {
	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Item("Book", 80));
		items.add(new Item("Pencil", 10));
		items.add(new Item("Pen", 10));
		items.add(new Item("Bag", 120));
		int sum = 0;
		for(Item i : items) {
			System.out.println(i.price);
			sum = sum + i.price;
		}
		System.out.println("Total sum = "+sum);
//		write a program to find the sum of all prices of the items
//		find the items which sum upto price = 100
	}
}
