package week1day2;

public class LearnArray {

	public static void main(String[] args) {
      //Array-->non-primitive dataype->class
		//to declare array
		
		int number[]= {2,3,4,5,6,7,8,9};
		//length-->8
	
	   int[] num= {12,13,4,6,3,6,2};
		//length-->7-->property
	   
	    int length = num.length;
		System.out.println(length);
		
		int length2 = number.length;
		System.out.println(length2);
		
		String[] name= {"Karthika","Faizen","Bala","Priya"};
		System.out.println(name.length);
		
		char[] letters= {'a','b'};
		
		System.out.println(name[0]);
		System.out.println(number[2]);
	
		System.out.println(number[7]);
//0 t0 7-->8 elements
		
		
	}

}
