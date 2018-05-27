package goldmansac;

import java.util.HashSet;
import java.util.Set;

public class FindSumPair {
	public static void main(String[] args) {
		int[] arr = { 14, 4, 7, 3, 5, 7 ,10,1};

		findPairOfSum(arr, 11) ;
	}

	private static void findPairOfSum(int[] arr, int sum) {
		Set<Integer> set = new HashSet<Integer>();

		for (int value : arr) {
			int diff = sum - value;
			if (!set.contains(diff)) { 
				set.add(value);
			} else {
				System.out.println("pair of sum: " + value + " " + diff);
			}
		}
	}


}
