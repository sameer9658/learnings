package goldmansac;

import java.util.Arrays;

public class MinimumDistanceBWTwoWords {
	public static void main(String[] args) {                   
         String s="One and office & one for loan of money for customs calc of goods , "
            + "which by a plain method be so ordered that " + "the merchant might with ease pay the highest "
           + "customes down, and so, by allowing the bank " + "four per cent advance, be first to secure "
           + "the $10 per cent which the king allows for prompt one     true one";

        
         //System.out.println(Integer.MAX_VALUE);
         System.out.println(getMinDIstance(s,"One", "and")); 
        
       }
      
       private static int getMinDIstance(String s, String w1,String w2){  
         String words[]=s.split(" ");
 
      
         int d1=0,d2=0,minDistance=Integer.MAX_VALUE,cur=0;
         for(String word:words){
           if(word.equals(" ")) cur++;
           if(word.equals(w1)){
             d1=cur + (int) Math.ceil(word.length()/2);               
           }
           if(word.equals(w2)){
             d2=cur+ (int) Math.ceil(word.length()/2);              
           }     
           int dist=Math.abs(d2-d1);
           if(dist<minDistance)
               minDistance=dist;     
           cur=cur+word.length()+1;
         }            
         return minDistance;
        
       }
}
