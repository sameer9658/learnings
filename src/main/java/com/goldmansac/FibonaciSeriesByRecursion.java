package goldmansac;

public class FibonaciSeriesByRecursion {

	public static void main(String[] args) {
			System.out.println(fibonacciUsingRecursion(4));
	}
	
	public static int fibonacciUsingRecursion(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacciUsingRecursion(n - 1) + fibonacciUsingRecursion(n - 2);
	}

	public static int fibonacciUsingIteration(int n) {
		int a = 0;
		int b = 1;
		int sum = 0;
		for (int i = 2; i <= n; i++) 
		{
			sum = a + b;
			a = b; 
			b = sum;
		}
		return sum;
	}


}
