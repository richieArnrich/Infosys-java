package Variables;

public class Increment {
	public static void main(String[] args) {
		int a = 10;
		int b = ++a;
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
		int c = 15;
		int d = --c;
		System.out.println("c = "+ c);
		System.out.println("d = "+ d);
		
		int r = --a + ++b - ++d - ++c;
		System.out.println(r);
	}
}
