package com.string;

import javax.persistence.criteria.CriteriaBuilder;

public class StringCheck {

    public static void main(String[] args) {
       StringCheck stringCheck = new StringCheck();
       //stringCheck.add(1.0d,2.0d);

       Integer integer = new Integer(5);
       Integer integer1 = new Integer(9);

       stringCheck.swap(integer,integer1);
       System.out.println("integer"+integer);
        System.out.println("integer1"+integer1);
    }

    public void add(int a,int b){

        System.out.print("int+int::");

    }

    public void add(float a,float b){

        System.out.print("float+float::");

    }

    public void add(double a,double b){

        System.out.print("double+double::");

    }

    public void swap(Integer i1, Integer i2){
        Integer temp;

        temp=i1;
        i1=i2;
        i2=temp;
    }
}
