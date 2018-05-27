package goldmansac;

public class OptimalPath {
	
	
	static int optimalPath(int[][] grid) {
		int[][] path = new int[2 + 1][4 + 1];

		
		path[2][0] = grid[2][0];

		for (int i = 1; i <= 4; i++) {
			path[2][i] = grid[2][i] + path[2][i - 1]; 
		}

		for (int i = 1; i >= 0; i--) { 
			path[i][0] = grid[i][0] + path[i + 1][0];
		}
		for (int i = 2; i > 0; i--) {
			for (int j = 1; j <= 4; j++) {
				path[i - 1][j] = findmax(path[i - 1][j - 1], path[i][j]) + grid[i - 1][j];
			}
		}
		return path[0][4];
	}

	static int findmax(int x, int y) {
		return x > y ? x : y;
	}

	public static boolean doTestPass() {
		int[][] input = { { 0, 0, 0, 0, 5 }, { 0, 1, 1, 1, 0 }, { 2, 0, 0, 0, 0 } };
		int result = optimalPath(input);

		return (result == 10);
	}

	public static void main(String[] args) {

		if (doTestPass())
			System.out.println("Test Passed");
		else
			System.out.println("Test Failded");
	}

}
