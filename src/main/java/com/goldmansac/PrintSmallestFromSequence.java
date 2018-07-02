package demo.practice.goldmansach;

import java.util.Scanner;
import java.util.Stack;
/*
Given a Pattern containing only Ns and Ms, N represents ascending and M represents descending, Each character (M or N) needs to display sequence of numbers (2 numbers ) explaining teh ascending or descending order
eg 21 -> represents descending -> M, The second character in the pattern takes last digit from first chanrachet and build the sequence and so on.

 constraints:-
 1. input can have maximum 8 chars
 2. output can have digits from 1-9 and can't repeat
 3. in  case no possible out or incorrect input value (blank/null/NON), return -1;

 Input :
 M
 Output : 21

 input :
 MNM

 output:
 2143

 */
public class PrintSmallestFromSequence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(printSmallestnumber(str));
    }

    private static int printSmallestnumber(String str) {
        int value = -1;
        if(null==str || str.trim().isEmpty() || str.length()>8 || str.contains(" ") || (!str.contains("N") && !str.contains("M"))){
            return -1;
        }else{
            int length = str.length();
            String ans="";
            Stack<Integer> stack = new Stack<>();
            for(int i = 0;i<=length;i++){
                stack.push(i+1);

                if(i==length || str.charAt(i)=='N'){
                    while(!stack.isEmpty()){
                        int num = stack.pop();
                        ans += num;
                    }
                }
            }
            value = Integer.parseInt(ans);
        }
        return value;
    }
}
