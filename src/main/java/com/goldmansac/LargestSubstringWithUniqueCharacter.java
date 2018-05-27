package goldmansac;

import java.util.LinkedHashMap;

public class LargestSubstringWithUniqueCharacter {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("aaabcbdeaf"));

	}
	
	public static String lengthOfLongestSubstring(String inputString) {
		char[] charArray = inputString.toCharArray(); 
         
        //Creating LinkedHashMap with characters as keys and their position as values.
         
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
         
        //Iterating through charArray
         
        for (int i = 0; i < charArray.length; i++) 
        {
            char ch = charArray[i];
         
            //If ch is not presen t in charPosMap, adding ch into charPosMap along with its position
             
            if(!charPosMap.containsKey(ch))
            {
                charPosMap.put(ch, i);
            }
             
            //If ch is already present in charPosMap, reposioning the cursor i to the position of ch and clearing the charPosMap            
            else
            {    
                i = charPosMap.get(ch);
                 
                charPosMap.clear();
            }
        }
        String longest = "";
        for(Character ch : charPosMap.keySet() ) {
         longest = longest + ch;     	
        }
         return longest;
	}


}
