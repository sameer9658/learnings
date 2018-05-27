package goldmansac;

public class AsciiToIntegerConversion {

	public static void main(String[] args) {
		System.out.println(Atoi(57));

	}
	
	public static int Atoi(int asciiValue) {
		int numericValue = -1; 
		if (asciiValue >= '0' && asciiValue <= '9') {
			numericValue = asciiValue - '0';
		}
		return numericValue;
	}


}
