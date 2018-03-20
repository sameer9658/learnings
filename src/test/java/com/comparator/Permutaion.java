package com.comparator;

import java.util.Collections;

public class Permutaion {

    public static void main(String args[]) {

        permute("", "abcdefghijklmnopqrstuvwxyz");

    }
    public static void permute(String temp , String word)
    {
        int size = word.length();
        if (size==0)
            System.out.println(temp);
    else{
           for(int i=0 ; i<size ; i++)
           {
               permute(temp+word.charAt(i) ,word.substring(0 , i) + word.substring(i+1 ,size )  );
           }

        }

    }
}
