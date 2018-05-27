package goldmansac;

public class PrimeFactorization {

	public static void main(String[] args) {
		int n =34;
		
		while (n % 2 == 0) {
			System.out.print(2 + " ");
			n = n / 2; 
		}

		for (int i = 3; i <= n; i = i + 2) { 
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
		}
	}
}
