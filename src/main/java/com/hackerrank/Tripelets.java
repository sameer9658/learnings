package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * Using this the value of ai will check with bi and increases the array count for a and b
 * **/
public class Tripelets {
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int arr[]=null;
        int countA = 0;
        int countB = 0;
        if(a0<b0){
            countB++;
        } else if(a0>b0){
            countA++;
        }
        if(a1<b1){
            countB++;
        } else if(a1>b1){
            countA++;
        }

        if(a2<b2){
            countB++;
        } else if(a2>b2){
            countA++;
        }

        arr = new int[2];
        arr[0]=countA;
        arr[1]=countB;
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}
