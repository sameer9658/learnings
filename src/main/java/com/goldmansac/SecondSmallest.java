package goldmansac;

public class SecondSmallest {

	public static void main(String[] args) {
		int[] unsortedArr = {15,87,44,82,67,34};
		System.out.println(getSecondSmallest(unsortedArr));
	}
	private static int getSecondSmallest(int[] unsortedArr) {
		int smallest = Integer.MAX_VALUE; 
		int secondSmallest = Integer.MAX_VALUE;

		if (unsortedArr.length < 2) {
			System.out.println(" Invalid Input ");
			System.exit(0);
		}

		for (int currElement : unsortedArr) {
			if (currElement < smallest) {
				secondSmallest = smallest; 
				smallest = currElement;
			} else if (currElement < secondSmallest && currElement != smallest)
				secondSmallest = currElement;
		}
		return secondSmallest;
	}

}
