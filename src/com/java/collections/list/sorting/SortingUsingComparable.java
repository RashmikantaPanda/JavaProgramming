//sorting using comparable interface
package com.java.collections.list.sorting;

import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1>{

    int rollno;
    String name;
    int age;

    Student1(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    public int compareTo(Student1 st) {
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
public class SortingUsingComparable {
    public static void main(String[] args) {
        ArrayList<Student1> list=new ArrayList<Student1>();
        Student1 s1=new Student1(100,"Rashmikanta",23);
        Student1 s2=new Student1(102,"Sourabha",25);
        Student1 s3=new Student1(101,"Jyotibikash",21);
        Student1 s4=new Student1(103,"Suryakanta",25);
        Student1 s5=new Student1(107,"Mitesh",22);


        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        Collections.sort(list);
        for(Student1 s:list){
            System.out.println(s.rollno+" "+s.name+" "+s.age+" ");
        }
    }
}
