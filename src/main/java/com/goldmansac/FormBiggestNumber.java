package goldmansac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FormBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {1, 34, 3, 989999, 9, 76, 45, 4};
		
		System.out.println(getBiggestNumber(arr)); 

	}
	private static String getBiggestNumber(int[] input) {
		ArrayList<String> list = new ArrayList<>();
		String number = ""; 
		for (int num : input) {
			list.add(String.valueOf(num));
		}
		Collections.sort(list, new NumberComparator());

		for (String str : list) {
			number += str;
		}
		return number;
	}


}

class NumberComparator implements Comparator<String> {
	public int compare(String i1, String i2) {
		String orig = i1 + "" + i2;
		String reverse = i2 + "" + i1;

		return reverse.compareTo(orig);
	}
}

