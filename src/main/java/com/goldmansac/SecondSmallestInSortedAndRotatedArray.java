package goldmansac;

public class SecondSmallestInSortedAndRotatedArray {

	public static void main(String[] args) {
		
		int input[] = {3,4,5,6,1,2};
		System.out.println(getSecondSmallest(input));

	}
	
	private static int getSecondSmallest(int[] input) {
		int index = Integer.MIN_VALUE;
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] > input[i + 1]) {
				index = i + 2;
				break;
			}
		}
		if (index == Integer.MIN_VALUE) {  
			index = 1;
		} else if (index >= input.length)
			index = 0;
		/*else if(input[index]==input[index+1]) {
			while(index<input.length) {
				
			}
		}*/
		return input[index];
	}


}
