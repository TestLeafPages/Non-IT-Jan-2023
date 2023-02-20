package LearnCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LearnSet {

	public static void main(String[] args) {
		
		Set<String> setName=new HashSet<String>();
		
		setName.add("Vidya");
		setName.add("Vidya");
		setName.add("Guhan");
		setName.add("Muthu");
		setName.add("Alice");
		System.out.println(setName);
		
		Set<String> setValues=new LinkedHashSet<String>(setName);
		System.out.println(setValues);
		
		Set<String> setVal=new TreeSet<String>(setName);
		System.out.println(setVal);
		
		int[] num = { 3, 5,6,3,8, 6, 8, 10, 34 };
		
		Set<Integer> numSet=new LinkedHashSet<Integer>();
		
		for(int i=0;i<=num.length-1;i++) {
			numSet.add(num[i]);
		}
		
		System.out.println(numSet);
		
		
		String g="google";
		char[] charArray = g.toCharArray();
		
		Set<Character> charSet=new TreeSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			charSet.add(charArray[i]);
		}
		
		System.out.println(charSet);
		
		
		
	}

}
