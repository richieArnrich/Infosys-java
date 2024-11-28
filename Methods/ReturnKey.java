package Methods;

public class ReturnKey {
	public static void main(String[] args) {
		System.out.println("Hi I am main");
		int data = giveData(100);
		System.out.println("The number I got: "+ data);
	}
	
	public static int giveData(int num) {
		int add = num + 10;
		return add;
	}
}
//return type specifies what kind of data is returned by the function
//return keyword is a control transfer statement which transfers the controller
//from the called function to the calling function