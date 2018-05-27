package goldmansac;

import java.util.Arrays;

public class WalkingRobotFinalCordinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pos= {0,0};
		System.out.println(Arrays.toString(getFinalCoordinates("UDDLRL",pos)));

	}
	
	private static int[] getFinalCoordinates(String move, int[] initialPosition) {

		for (int i = 0; i < move.length(); i++) {
			String c = String.valueOf(move.charAt(i)); 
			switch (c) {
			case "U":
				initialPosition[1] += 1; 
				break;
			case "D":
				initialPosition[1] -= 1;
				break;
			case "L":
				initialPosition[0] -= 1;
				break;
			case "R":
				initialPosition[0] += 1;
				break;
			}
		}
		return initialPosition;
	}



}
