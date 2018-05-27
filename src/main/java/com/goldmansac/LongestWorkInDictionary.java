package goldmansac;

public class LongestWorkInDictionary {

	public static void main(String[] args) {

		String str = "thisaxbcdbetterbook";
		int length = Integer.MIN_VALUE;
		String longestStr = "";

		for (int i = 0; i < str.length(); i++) {
			String currStr = "";
			for (int j = str.length() - 1; j > i; j--) {
				currStr = str.substring(i, j + 1);
 
				if (isDisctionary(currStr)) {
					if (currStr.length() > length) {
						length = currStr.length();
						longestStr = currStr; 
					}
				}
			}
		}
		System.out.println(longestStr);
	}

	private static boolean isDisctionary(String str) {
		String[] dictionary = { "this", "is", "a", "better", "book" };
		for (String currStr : dictionary) {
			if (currStr.equalsIgnoreCase(str)) {
				return true;
			}
		}
		return false;
	}

	
}
