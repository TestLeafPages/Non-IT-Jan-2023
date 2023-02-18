package week3day1;

public class LearnString {

	public static void main(String[] args) {
		
		//literal 
		 String s="Testleaf";
		//String pool memory
		
		/*
		 * s=s.concat("Learning"); System.out.println(s);
		 */
		//Using Instance
		String s1=new String("testleaf");
		//heap memory
		
		
		//to check how the values placed in memory
		
		if(s==s1) {
			System.out.println("Both strings are placed in same memory address");
		}
		else {
			System.out.println("Both Strings are placed in  different memory");
		}

		//to compare the values of string
		if(s.equals(s1)) {
			System.out.println("String values are same");
		}
		else {
			System.out.println("String Values are different");
		}
		
		//to ignore the (uppercase/lowercases)cases of the string values
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("String values are same");
		}
		else {
			System.out.println("String Values are different");
		}
		
		// to match /check the part of value present in the String
		
		boolean contains = s.contains("leaf");
		System.out.println(contains);
		
		
		
	}

}
