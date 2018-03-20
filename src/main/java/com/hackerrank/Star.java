package com.hackerrank;

public class Star {
    public static void main(String[] args) {
        for(int i=0 ; i<6 ;i++){
            for(int j = 0; j <= 6-i-2; j++){
                System.out.print(" ");
            }
            for(int j = 6-i-1 ; j< 6; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
