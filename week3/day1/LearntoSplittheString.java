package week3day1;

public class LearntoSplittheString {

	public static void main(String[] args) {
		
		String name="Testleaf Company";
		
		String[] cname=name.split(" ");
		
		for(int i=0;i<=cname.length-1;i++) {
		System.out.println(cname[i]);
		//Testle ->index-0
		//f comp->index=1
		//ny->index -2
		}
		
		for(int i=cname.length-1;i>=0;i--) 
		{
			System.out.print(cname[i]);
			}
		
		
		
	}

}
