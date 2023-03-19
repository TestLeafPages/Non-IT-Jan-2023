package learnExceptionHandling;

public class LearnFinally {

	public static void main(String[] args) {
		
		int x=10;
		int y=0;
		
		try {
			System.out.println(x/y);
		}catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Kill the chromedriver");
		}
		
		System.out.println("End of program");
		
	}

}
