package goldmansac;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharachterOfAString {

	public static void main(String[] args) {
		System.out.println(getFirstUniqueChar("aabccceb"));

	}
	private static Character getFirstUniqueChar(String str) {
		Map<Character, Integer> map = new LinkedHashMap<>(); 
		for (int i = 0; i < str.length(); i++) {
			char key = str.charAt(i); 
			int charCount = 1;
			if (map.containsKey(key)) {
				charCount = map.get(key) + 1;
				map.put(key, charCount);
			}else
			map.put(key, charCount);
		}

		for (Character c : map.keySet()) {
			if (map.get(c) == 1) {
				return c;
			}
		}
		return null;
	}


}
