package goldmansac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListOfLongestWordInDictonary {
	private static HashSet<String> result = new HashSet<>();
	private static int max_len = 0;

	public static void main(String[] args) {
		String letters = "dsetog";
		System.out.println(longestWordInDict(letters, new Dictionary()));
	}

	private static Set<String> longestWordInDict(String letter, Dictionary dict) {
		permute(letter.toCharArray(), 0, dict);
		return result;
	}

	private static void permute(char[] arr, int start, Dictionary dict) {
		if (start == arr.length) {
			String s1 = "";
			for (int i = 0; i < arr.length; i++) {
				s1 += arr[i];
			}
			combination(s1.toCharArray(), dict);
		} else {
			for (int i = start; i < arr.length; i++) {
				swap(arr, start, i);
				permute(arr, start + 1, dict);
				swap(arr, start, i);
			}
		}
	}

	private static void combination(char[] chars, Dictionary dict) {
		String str = "";
		for (int i = 0; i < chars.length; i++) {
			str += chars[i];
			if (Dictionary.isAvailableInDictionary(str)) {
				if (str.length() == max_len) {
					result.add(str);
				} else if (str.length() > max_len) {
					max_len = str.length();
					result.clear();
					result.add(str);
				}
			}
		}
	}

	private static char[] swap(char[] arr, int len, int i) {
		char temp = arr[len];
		arr[len] = arr[i];
		arr[i] = temp;

		return arr;
	}

	static class Dictionary {
		static final String[] words = { "to", "toe", "toes", "doe", "dog", "god", "dogs", "book", "banana" };

		static boolean isAvailableInDictionary(String str) {
			List<String> wordList = Arrays.asList(words);
			return wordList.contains(str);
		}
	}
}
