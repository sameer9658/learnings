package com.comparator;

import java.util.Comparator;

public class Student {

    private String name;
    private int id;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void displayName(){
        System.out.println("Hello"+name);
    }

    public static Comparator<Student> nameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }};

    public static Comparator<Student> ageComaparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return -(o1.getAge() - o2.getAge());
        }
    };

    public static Comparator<Student> idComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getId() - o2.getId();
        }
    };


    }




