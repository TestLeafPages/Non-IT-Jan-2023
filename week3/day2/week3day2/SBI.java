package week3day2;

public class SBI extends Apartment implements RBI,BankRules {

	
	public void KYCdoc() {
		System.out.println("Aadhar is enough");
		
	}

	@Override
	public void signature() {
		System.out.println("Signature is manadtory");
		
	}

	@Override
	public void moneyTransfer() {
		System.out.println("commision to the bank");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit with rate of interest 5%");
		
	}

	@Override
	public void rateOfInterest() {
		System.out.println("loan roi is 11%");
		
	}

	@Override
	public void underConstruction() {
	System.out.println("space given to SBI bank");
		
	}
	
	

}
