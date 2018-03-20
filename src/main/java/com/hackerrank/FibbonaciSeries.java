package com.hackerrank;

import java.util.Scanner;

public class FibbonaciSeries {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        printFibo(number);
    }
    public static void printFibo(int number){
        int firstNumber=0;
        int secondNumber=1;
        for(int j=1;j<number;j++){
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber=temp+secondNumber;
        }
        System.out.println(secondNumber);

    }
}
