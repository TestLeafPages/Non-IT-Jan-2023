package week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnToConvertArraytoList {

	public static void main(String[] args) {

		Integer[] numbers = { 1, 3, 5, 6, 7, 8, 9 };

		List<Integer> numList = new LinkedList<Integer>();
		numList.addAll(Arrays.asList(numbers));

		int[] num = { 3, 5, 6, 8, 10, 34 };

		for (int i = 0; i <= num.length - 1; i++) {
			numList.add(num[i]);// 3,
		}

		// to sort a list
		Collections.sort(numList);
		System.out.println(numList);

		// to find duplicates-Method1
		for (int j = 0; j < numList.size() - 1; j++) {
			if (numList.get(j) == numList.get(j + 1)) {
				System.out.println(numList.get(j));

			}
		}

		// method 2-->remove duplicates
		List<Integer> dupList = new ArrayList<Integer>();

		for (Integer value : numList) {
			if (!dupList.contains(value)) {
				dupList.add(value);
			}
		}
		System.out.println(dupList);

	}

}
