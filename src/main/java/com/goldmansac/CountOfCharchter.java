package goldmansac;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class CountOfCharchter {

	public static void main(String[] args) {
		System.out.println(printCountOfChars("aaasseddfffffuuuuiiiia"));
	}
	
	private static String printCountOfChars(String input) {
		String patternToPrint = "";
		
		Stack<Character> ch = new Stack<Character>();
		
		Map<String, Integer> map = new LinkedHashMap<String,Integer>();

		for (int i = 0; i < input.length(); i++) {
			
			String key = String.valueOf(input.charAt(i));

			if (map.containsKey(key)) {
				int value = map.get(key);
				map.put(key, value + 1);
			} else {
				map.put(key, 1);
			}

       }

		for (String eachKey : map.keySet()) {
			patternToPrint += map.get(eachKey) + eachKey;
		}
		return patternToPrint;
}


}
