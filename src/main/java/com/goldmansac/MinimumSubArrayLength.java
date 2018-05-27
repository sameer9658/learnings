package goldmansac;

import java.util.Arrays;

public class MinimumSubArrayLength {

	public static void main(String[] args) {
		int[] arr ={1,2,3,4};
		System.out.println(minimumSubArrayLength(arr,6));

	}
	
	private static int minimumSubArrayLength(int[] arr, int sum) {
		int minLength = arr.length + 1; 
		
		for (int start = 0; start < arr.length; start++) { 
			int currentSum = arr[start];
			if (currentSum > sum)
				return 1;
			for (int end = start + 1; end < arr.length; end++) {
				currentSum += arr[end];
				if (currentSum > sum && (end - start + 1) < minLength)
					minLength = (end - start + 1);
			}
		}
		return minLength;
	}
	
	private static int minimumSubArrayLengthSorted(int[] arr, int sumToCheck) {
		Arrays.sort(arr);

		int count = 0;
		int sum = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			sum += arr[i];
			count++;
			if (sum > sumToCheck) {
				return count;
			}
		}
		return -1;
	}



}
