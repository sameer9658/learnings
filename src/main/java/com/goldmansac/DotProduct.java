package goldmansac;

public class DotProduct {

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 1 };
		int[] b = { 1, 2, 2, 1 };

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i] + b[i]; 

		}
		System.out.println("Dot product is: " + sum);
	}


}
