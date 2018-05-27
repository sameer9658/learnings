package goldmansac;

public class NewtonRapsonSquareRoot {

	public static void main(String[] args) {
		System.out.println(Compute(16));

	}
	
	public static float Compute(float Number) {
		float temp = Number / 2;

		while (true) {
			float sqrRoot = temp - (temp * temp - Number) / (2 * temp);
			float value = Math.abs(temp - sqrRoot);

			if (value < 0.0001) 
				return sqrRoot;
			else
				temp = sqrRoot;
		}
	}


}
