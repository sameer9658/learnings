package com.comparator;

import java.util.*;

public class StudentIdSort {

    public void sortAsPerIdOfStudent(Map<Student,String> studentStringMap){

        List<Map.Entry<Student,String>> toSort = new ArrayList(studentStringMap.entrySet());
        Collections.sort(toSort, new Comparator<Map.Entry<Student, String>>() {
            @Override
            public int compare(Map.Entry<Student, String> o1, Map.Entry<Student, String> o2) {
                return o1.getKey().getId()-o2.getKey().getId();
            }
        });

        System.out.println(toSort);
    }

}
