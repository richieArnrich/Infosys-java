package Variables;

public class ConditionalOperator {
	public static void main(String[] args) {
		String result = (10>5)?"10 is > 5":"5 is >10";
		System.out.println(result);
		int result2 = (10>15)?10:15;
		System.out.println(result2);
		
		int n1 = 15; int n2 = 20; int n3 = 10;
		String greatest = (n1>n2 && n1>n3)?
				"n1 is greatest":(n2>n3)?"n2 is greatest":"n3 is greatest";
		System.out.println(greatest);
	}
}