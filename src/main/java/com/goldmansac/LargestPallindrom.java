package goldmansac;

public class LargestPallindrom {

	public static void main(String[] args) {
		System.out.println(getLongestPalindrome("forgeeksskeegfor"));

	}
	
	public static String getLongestPalindrome(String input) {
		int length = 0;
		String longestPalindrome = "";
		
		if (input.length() == 0)
			return "Provide the input"; 

		if (input.length() == 1)
			return input;
		
		char[] ch = input.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i; j < ch.length; j++) { 
				String str = input.substring(i, j + 1);
				if (str.equals(new StringBuilder(str).reverse().toString())) {
					if (str.length() > length) {
						length = str.length();
						longestPalindrome = str;
					}
				}
			}
		}
		return longestPalindrome;
	}



}
