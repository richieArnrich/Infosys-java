package CTP;

public class Addition {
	public void add(int a, int b) {
		System.out.println("Method 1");
		int r = a+b;
		System.out.println(r);
	}
	public void add(String a,String b) {
		System.out.println("Method 2");
		String r = a+b;
		System.out.println(r);
	}
	public void add(int a,int b,int c) {
		System.out.println("Method 3");
		int r = a+b+c;
		System.out.println(r);
	}
	public static void main(String[] args) {
		Addition a1 = new Addition();
//		a1.add(5, 5, 24, 25); parameters dont match
		a1.add("151", "251");
	}
}
