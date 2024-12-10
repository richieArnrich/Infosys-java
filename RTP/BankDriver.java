package RTP;

import java.util.Scanner;

public class BankDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ROI given by RBI is: ");
		ReserveBank rs = new ReserveBank();
		rs.PersonalLoan();
		rs.GoldLoan();
		System.out.println("Choose: 1. ICICI 2. HDFC");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			ICICIbank ib = new ICICIbank();
			ib.PersonalLoan();
			ib.GoldLoan();
		}break;
		case 2:{
			HDFCbank hb = new HDFCbank();
			hb.PersonalLoan();
			hb.GoldLoan();
		}break;
		default:{
			System.out.println("Invalid input");
		}
		}
		
	}
}
