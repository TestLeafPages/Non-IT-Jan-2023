package learnExceptionHandling;

public class LearnException {

	public static void main(String[] args) {
		
		int x=10;
		int y=1;	
		int arr[] = {2,3,4,5,6};
		try {
			System.out.println(x/y);
			System.out.println(arr[6]);
		}catch (ArithmeticException e) {
			System.out.println(e);
			
		} /*
			 * catch(ArrayIndexOutOfBoundsException a) {
			 * System.out.println("The given index is wrong"); }
			 */catch(Exception g) {
			System.out.println(g);
		}
		
		System.out.println("End of Program");
	}

}
