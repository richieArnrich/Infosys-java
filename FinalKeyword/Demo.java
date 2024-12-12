package FinalKeyword;

public class Demo {
	public static void main(String[] args) {
		final int x = 10;
		System.out.println("x before: "+x);
//		x = 20; //when a variable is declared as final, we cannot update it.
		System.out.println("x cannot be updated: "+x);
	}
}
