package week1day2;

public class LearnSwitchCase {

	public static void main(String[] args) {
		
		String browserVendor="Chrome";
		switch(browserVendor) {
		
		case "chrome":
			System.out.println("Start chrome browser");
		    break;
		case "edge":
			System.out.println("Start edge browser");
		    break;
		default :
			System.out.println("Start mozilla browser");
		}
		

	}

}
