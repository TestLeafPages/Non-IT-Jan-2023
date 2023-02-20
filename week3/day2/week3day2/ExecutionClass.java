package week3day2;

public class ExecutionClass extends ICICI {

	
	final int x=15;
	public static void main(String[] args) {
	
		ICICI bank=new ICICI();
		bank.deposit();
		
		
		bank.moneyTransfer();
		bank.rateOfInterest();
	
		
		SBI sbank=new SBI();		
		sbank.deposit();
		sbank.KYCdoc();
		
		RBI rules=new ICICI();
		RBI srules=new SBI();
		
		
	//	RBI rules =new RBI();
		
		
		
		
	}

}
