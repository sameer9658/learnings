package goldmansac;

public class SnowPackProblemFindWater {

	public static void main(String[] args) {
		
       int[]arr = {4,2,5,4,6};
       System.out.println(findWater(arr,arr.length));
       
}
	
	static int findWater(int[] h,int n) {
		int ans = 0;
		int l=0,r=n-1,left_max=0,right_max=0;
	
		while(l<r) {
			if(h[l]<h[r]) {
				if(h[l]>=left_max) {
					left_max = h[l];
				}else {
					ans+=left_max-h[l];
					
				}
				l+=1; 
			}else 
		    {
				if(h[r] >=right_max) {
					right_max = h[r];
				}else {
					ans+=right_max-h[r];
					
				}
				r-=1;
			}
		}
		
		return ans;
	}
	static int findWater(int[] arr) {
		int n = arr.length;
		int left[] = new int[n];
		int right[] = new int[n];
 
		// left[i] contains height of tallest bar to the left of i'th bar including
		// itself
		// Fill left array
		left[0] = arr[0];
		for (int i = 1; i < n; i++)
			left[i] = Math.max(left[i - 1], arr[i]);

		// Right [i] contains height of tallest bar to the right of ith bar including
		// itself
		// Fill right array
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--)
			right[i] = Math.max(right[i + 1], arr[i]);

		// Calculate the accumulated water element by element consider the amount of
		// water on i'th bar, the amount of water accumulated on this particular bar
		// will be equal to min(left[i], right[i]) - arr[i] .
		int water = 0;
		for (int i = 0; i < n; i++)
			water += Math.min(left[i], right[i]) - arr[i];

		return water;
	}


}
