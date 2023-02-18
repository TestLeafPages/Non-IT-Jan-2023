package week3day1;

public class LearnToCountCharacter {

	public static void main(String[] args) {
		
		String cname="TestLeaf learning Selenium in easy methods";
		//to get the count of required character
		
		//Method:1
		int count=0;
		//to charray array
		char[] charArray = cname.toCharArray();
		
		for(int i=0;i<=charArray.length-1;i++)
		{
			if(charArray[i]=='a') {
				
				count++;//1 //2				
			}
			
		}

		System.out.println("The count of character a is " +count);
	
	
	
	//Method:2
	int counter=0;
	for(int j=0;j<cname.length();j++) {
		
		if(cname.charAt(j)=='s') {
			
			counter++;
		}
			}
	System.out.println("The count of the character s is " +counter);
	

}
}