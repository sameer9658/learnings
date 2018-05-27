package goldmansac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PascalTriangle { 

	public static void main(String[] args) {
		System.out.println(generatePascal(3, 5));

	}
	private static int generatePascal(int col, int row) {

		Map<Integer, ArrayList<Integer>> map = new HashMap<>();
		map.put(0, new ArrayList<>(Arrays.asList(1)));
		for (int i = 1; i <= row; i++) {
			ArrayList<Integer> list = new ArrayList<>(); 
			ArrayList<Integer> preList = map.get(i - 1);
			for (int k = 0; k < preList.size() - 1; k++) {
				int sum = preList.get(k) + preList.get(k + 1);
				list.add(sum);
			}
			list.add(0, 1);
			list.add(i, 1);
			map.put(i, list);
		}
		return (map.get(row).get(col));
	}



}
