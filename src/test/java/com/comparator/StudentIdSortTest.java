package com.comparator;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class StudentIdSortTest {

    @Test
    public void testStudentSort(){
        Map<Student,String> map = new HashMap<>();
        map.put(new Student("Samir", 12, 26),"Student1");
        map.put(new Student("Chandan", 15, 29),"Student2");
        map.put(new Student("Sachin", 17, 20),"Student3");
        StudentIdSort studentIdSort = new StudentIdSort();
        studentIdSort.sortAsPerIdOfStudent(map);
    }

}
