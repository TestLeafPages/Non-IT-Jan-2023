package week1day2;

public class LearntoCompare {

	public static void main(String[] args) {
     
		int[] num= {2,4,5,2,6,7,6};//literal way
		
		//find the duplicates in the array
		//nested loop
		for(int i=0;i<num.length;i++) {//outer loop
			//0-->inner loop condition is satisified-->till range of j
			//
			for(int j=i+1;j<num.length;j++) {//inner loop
				if(num[i]==num[j]) {
					//num[0]==num[1]
					//num[0]==num[2]
					//..num[0]==num[7]
					System.out.println("The duplicated values " +num[i]);
					//j++
				}
				//i++
			}
			
		}
		
		
		
	}

}
