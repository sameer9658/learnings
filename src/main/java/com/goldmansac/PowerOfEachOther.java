package goldmansac;

public class PowerOfEachOther{

	public static void main(String[] args) {
		int[] x = {2, 3, 5, 4};
		int[] y = {4, 6, 9, 3};

		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < y.length; j++)
			{
				if (Math.pow(x[i], y[j]) == Math.pow(y[j], x[i])) 
				{
					System.out.println("(" + x[i] + "," + y[j] + ") and (" + y[j] + "," + x[i] + ")");
				}
			}
		}
	} 

	public static int pow(int a, int b) 
	{
		int temp = 1;
		for (int i = 0; i < b; i++) {
			temp = temp * a;
		}
		return temp;
	}
	
	private static boolean isEquals(int a, int b) {
		int powerOfA = a;
		for (int i = 1; i < b; i++) {
			powerOfA = powerOfA * a;
		}
		int powerOfB = b;
		for (int j = 1; j < a; j++) {
			powerOfB = powerOfB * b;
		}
		return (powerOfA == powerOfB);
	}



}
