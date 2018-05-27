package goldmansac;

import java.util.Arrays;
import java.util.Stack;

public class FirstRepeatingIndexAndItsLength {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(longestRepeatingStr("aabbbbddcc")));

	}
	public static int[] longestRepeatingStr(String str) {
		char[] ch = str.toCharArray();
		
		int len = 0;  
		int index = 0;

		for (int i = 0; i < ch.length;) {
			char c = ch[i];
			int count = 0;
			int ind = i;
			while (i < ch.length && c == ch[i]) {
				count++;
				i++;
			}
			if (count > len) {
				index = ind;
				len = count;
			}
		}

		int[] res = { index, len };
		return res;
	}


}
