package Encapsulation;

public class Bank {
	private String userName;
	private String email;
	private long contact;
	private long bankAcc;
	private String ifsc;
	
	Bank(String userName, String email,long contact,long bankAcc,String ifsc){
		this.userName = userName;
		this.email = email;
		this.contact = contact;
		this.bankAcc = bankAcc;
		this.ifsc = ifsc;
	}
	public String getName() {
		return this.userName;
	}
	public void setName(String newUserName) {
		this.userName = newUserName;
		System.out.println("User name updated");
	}
}
