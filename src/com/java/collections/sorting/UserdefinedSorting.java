package com.java.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{

    int rollno;
    String name;
    int age;

    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    public int compareTo(Student st) {
        if(age==st.age)
            return 0;
        else if (age>st.age){
            return -1;
        }
        else {
            return 1;
        }
    }



}
public class UserdefinedSorting {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<Student>();
        Student s1=new Student(100,"Rashmikanta",23);
        Student s2=new Student(102,"Sourabha",25);
        Student s3=new Student(101,"Jyotibikash",21);
        Student s4=new Student(103,"Suryakanta",25);
        Student s5=new Student(107,"Mitesh",22);


        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        Collections.sort(list);
        for(Student s:list){
            System.out.println(s.rollno+" "+s.name+" "+s.age+" ");
        }
    }
}
