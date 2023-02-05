package week1day2;

public class CheckOddnumber {

	public static void main(String[] args) {
		
		//if -->num /2 --->remainder as 0 then print it as even
		//num%2==0
		//else -->num is odd
		//get all the even numbers between 2 to 20
		
		for(int i=2;i<=20;i++) {
		if(i%2==0) {
			System.out.println("The given number"+i+" is Even");
		}else {
			System.out.println("The given number"+i+" is Odd");
		}
		
	}

	}}
