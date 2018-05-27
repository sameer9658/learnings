package goldmansac;

public class StaircaseProblem {

	public static void main(String[] args) {
		int step = 5;
		System.out.println("Number of ways = " + countWaysUtil(step+1,4));
	}

	private static int countWays(int step) {
		return countWaysUtil((step + 1),4);
	}
	
	static int countWaysUtil(int n, int m)
    {
        if (n <= 1) 
            return n;
        int res = 0;
        for (int i = 1; i<=m && i<=n; i++) 
            res += countWaysUtil(n-i, m);
        return res;
    }


}
