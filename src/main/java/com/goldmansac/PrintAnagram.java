package goldmansac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintAnagram {

	public static void main(String[] args) {
		
		List<String> anagrams = new ArrayList<>();
		anagrams.add("muum"); 
		anagrams.add("mmuu");
		anagrams.add("dog");
		anagrams.add("god");
		printAnagram(anagrams);

	}
	
	public static void printAnagram(List<String> anagrams) {
		Map<String, List<String>> map = new HashMap<>(); 
		List<String> list;
		for (String str : anagrams) {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);

			String key = String.valueOf(chars);

			if (!map.containsKey(key)) {
				list = new ArrayList<>();
			} else {
				list = map.get(key);
			}
			list.add(str);
			map.put(key, list);
		}
		for (String key : map.keySet()) {
			System.out.print(map.get(key) + ",");
		}
	}


}
