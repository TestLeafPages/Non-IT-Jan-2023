package learnExceptionHandling;

public class LearnCheckedException {

	public static void num(int n1,int n2) //throws InterruptedException {
	{
		if(n1>n2) {
			try {
			Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(n1-n2);
		}else {
			throw new RuntimeException("Invalid input");
		}
		
			}
	
	
	public static void main(String[] args)// throws InterruptedException {
	{
		num(1,5);
		
		
		

	}

}
