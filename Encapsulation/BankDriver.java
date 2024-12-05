package Encapsulation;

public class BankDriver {
	public static void main(String[] args) {
		Bank b = new Bank("Balaji",
				"balaji@gmail.com",123456789l,
				1234567890123l,"icici123");
		System.out.println("User Name = "+ b.getName());
		b.setName("Goutham");
		System.out.println("New username: "+ b.getName());
		System.out.println("AccountNo: "+ b.getAccNo());
		System.out.println("Ifsc: "+ b.getIfsc());
	}
}
