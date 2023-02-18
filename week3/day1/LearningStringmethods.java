package week3day1;

public class LearningStringmethods {

	public static void main(String[] args) {

		String firstname = "Karthick";

		String lowerCase = firstname.toLowerCase();
		System.out.println(lowerCase);

		String upperCase = lowerCase.toUpperCase();
		System.out.println(upperCase);

		String leadid = "100045Testleaf";
		// to replace any character with any value
		System.out.println(leadid.replace("f", "s"));

		// print the name/word ->\\d
		String leadName = leadid.replaceAll("[^0-9]", "");
		System.out.println(leadName + "leadName");
		// print only the numbers

		String leadnum = leadid.replaceAll("\\D", "");
		System.out.println(leadnum + 12);
		// Convert String to Interger
		int parseInt = Integer.parseInt(leadnum);
		System.out.println(parseInt + 12);

		String fruit = "OranGes";
		// vowels-aeiou,AEIOU
		String fruitWitoutVowels = fruit.replaceAll("[^aeiouAEIOU]", "");

		System.out.println(fruitWitoutVowels);

		String name = "MuthuKumaran";
		// to print /get any char seq from a paricular index
		String substring = name.substring(5);
		System.out.println(substring);
		// 0to 4
		String substring2 = name.substring(2, 5);
		System.out.println(substring2);

	}

}
