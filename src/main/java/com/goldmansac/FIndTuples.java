package goldmansac;

import java.util.LinkedHashSet;
import java.util.Set;

public class FIndTuples {

	public static void main(String[] args) {
		findUniqueTuple("aabc");

	}
	
	public static void findUniqueTuple(String str) {
		
		Set<String> set = new LinkedHashSet<>();

		for (int i = 0; i < str.length() - 1; i++) {
			set.add(str.substring(i, i + 2));			
}
		System.out.print(set); 
	}
	
	/*public static void main(String[] args) {
	      String input = "abcde";
	      int length = 4;
	      System.out.println(getUniqueTuple(input, length));
		}
	  
	  private static Set<String> getUniqueTuple(String input, int length){
	    Set<String> set = new LinkedHashSet<>();
	    String temp = input+input;
	    
	    for(int i=0; i<input.length(); i++){
	      set.add(temp.substring(i, i+length));
	    }
	    return set;s
	  }	*/



}
