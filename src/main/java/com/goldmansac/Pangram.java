package goldmansac;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String panagram(String str) {
		int[] arr = new int[26];
		 
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char charr = str.charAt(i);
			if (charr - 'a' >= 0 && charr - 'a' <= 26) {
				arr[charr - 'a'] = 1;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 26; i++) { 
			if (arr[i] == 0) {
				sb.append((char) ('a' + i));
			}
		}
		return sb.toString();
	}


}
