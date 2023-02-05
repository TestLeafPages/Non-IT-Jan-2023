package week1day2;

import java.util.Arrays;

public class LargestNumberinArray {

	public static void main(String[] args) {
		int[] arr= {2,1,8,4,5,2,5,6};
		//0,1,2,3,4,5,6,7-index
		//2,1,8,4,5,2,5,6
		//arrange the number in order

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		System.out.println("After Sorting");
		
		Arrays.sort(arr);//ascendening order
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Largest element in the array" +arr[arr.length-1]);
		
		System.out.println("Reversed array");
		//0->length-1
		//1->n-->length
		for(int k=arr.length-1;k>=0;k--) {
			System.out.println(arr[k]);
		}
		

	}

}
