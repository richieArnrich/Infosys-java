package Encapsulation;

public class Bank {
	private String userName; //read and write
	private String email; //read and write
	private long contact; //read and write
	private long bankAcc; //read
	private String ifsc; //read
	
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
	public long getAccNo() {
		return this.bankAcc;
	}
	public String getIfsc() {
		return this.ifsc;
	}
}
