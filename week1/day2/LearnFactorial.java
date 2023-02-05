package week1day2;

public class LearnFactorial {

	public static void main(String[] args) {
		//5!
		//for(1->5)
		//op=op*i;
		
		//1*2*3*4*5=?
		int input=5;
		int fact=1;
				for(int i=1;i<=input;i++) {
			
			fact=fact*i;
			//1*1= 1
			//1*2=2
			//2*3=6
		}
		System.out.println(fact);
	}

}
