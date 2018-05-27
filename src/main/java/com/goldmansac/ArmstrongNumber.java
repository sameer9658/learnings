package goldmansac;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println(isArmstrong(371));
	}
	
	private static boolean isArmstrong(int input) {
		int length = String.valueOf(input).length();
		int sum = 0;
		int num = input; 
		while (num > 0) {
			int temp = num % 10;
			sum += Math.pow(temp, length);
			num = num / 10;
		}
		return (input == sum);
	}

}
