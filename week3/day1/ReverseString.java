package week3day1;

public class ReverseString {

	public static void main(String[] args) {

		String S = "Ranjith";

		// htijnaR
		char[] charArray = S.toCharArray();
		//['R','a','n','j','i','t','h']

		System.out.println(charArray);
		System.out.println();
		for (int i = charArray.length-1; i >= 0; i--) {
			// 7,6,5,4,3,2,1
			System.out.print(charArray[i]);
		}

	}

}
