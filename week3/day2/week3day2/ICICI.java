package week3day2;

public class ICICI implements RBI,BankRules{

	@Override
	public void moneyTransfer() {
	  System.out.println("Tranfer 1 lakh");		
	}

	
	public void deposit() {
		System.out.println("Deposit amount 3lakh");
		
	}

	
	public void rateOfInterest() {
		System.out.println("ROI as 8%");
	}

	
	public void KYCdoc() {
		System.out.println("Submitted the doc");
		
	}

	
	public void signature() {
		
		System.out.println("Signature should match" +rateOfInterest );
	}
	
	
	public void rate() {
		System.out.println("From ICICI");
	}

	
	
	
	
}
