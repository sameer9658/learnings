package demo.practice.goldmansach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Given an Integer Array as input , find out the intergers which contains the digit 1,2,3 numbers in the formation. The order of 1,2,3 need not be sequential

1. if multiple number qualifies the condition. The outcome should be ordered based on numeric value (ascending order) separated by comma.
2. if no number qualifies , it should return -1

Input :
{1456, 345671,432118,123}

Outupt:
123,432118

 */
public class NumberChecker {


    public static void main (String args[]) {

        int[] arr = {1456, 345671,432118,123};

        List<Integer> list = new ArrayList<>();
        for(int i = 0 ;i <arr.length;i++){
            String number = String.valueOf(arr[i]);
            if(number.contains("1") && number.contains("2") && number.contains("3")){
                list.add(arr[i]);
            }
        }

        Collections.sort(list);
        System.out.println(list);
        StringBuilder sb = new StringBuilder();
        for(Integer i :list){
            sb.append(i).append(",");
        }

        String str = sb.toString();
        str = str.substring(0,str.length()-1);
        System.out.println(str);
    }
}
