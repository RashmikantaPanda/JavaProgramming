//Sorting using Comparator interface
package com.java.collections.sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student{

    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}
class RollComparator1 implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.rollno==o2.rollno)
            return 0;
        else if(o1.rollno> o2.rollno)
            return 1;
        else
            return -1;
    }

    @Override
    public Comparator<Student> reversed() {
        return Comparator.super.reversed();
    }
}
class AgeComparator1 implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.age==o2.age)
            return 0;
        else if (o1.age>o2.age) {
            return 1;
        }
        else
            return -1;
    }

    @Override
    public Comparator<Student> reversed() {
        return Comparator.super.reversed();
    }
}

class NameComparator1 implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }

    @Override
    public Comparator<Student> reversed() {
        return Comparator.super.reversed();
    }
}
public class GenericComparator {
    public static void main(String[] args) {
        ArrayList<Student> li1=new ArrayList<Student>();
        li1.add(new Student(100,"Rashmikanta",23));
        li1.add(new Student(145,"Sourabha",29));
        li1.add(new Student(110,"JyotiBikash",23));
        li1.add(new Student(120,"Suryakanta",22));
        li1.add(new Student(115,"Barenyabinayak",24));

        System.out.println("Default List: ");
        for(Student s:li1){
            System.out.println(s.rollno+" "+s.name+" "+s.age+" ");
        }
        System.out.println("--------------------------");
        System.out.println("Sorting by age : ");
        Collections.sort(li1,new AgeComparator1());
        for(Student s:li1){
            System.out.println(s.rollno+" "+s.name+" "+s.age+" ");
        }
        System.out.println("Sorting by age in Reverse Order : ");
        Collections.sort(li1,new AgeComparator1().reversed());
        for(Student s:li1){
            System.out.println(s.rollno+" "+s.name+" "+s.age+" ");
        }
        System.out.println("--------------------------");
        System.out.println("Sorting by Name");
        Collections.sort(li1,new NameComparator1());
        for(Student s:li1){
            System.out.println(s.rollno+" "+s.name+" "+s.age+" ");
        }
        System.out.println("Sorting by Name in reverse order : ");
        Collections.sort(li1,new NameComparator1().reversed());
        for(Student s:li1){
            System.out.println(s.rollno+" "+s.name+" "+s.age+" ");
        }

        System.out.println("--------------------------");
        System.out.println("Sorting by RollNo");
        Collections.sort(li1,new RollComparator1());
        for(Student s:li1){
            System.out.println(s.rollno+" "+s.name+" "+s.age+" ");
        }
        System.out.println("Sorting by RollNo in reverse order : ");
        Collections.sort(li1,new RollComparator1().reversed());
        for(Student s:li1){
            System.out.println(s.rollno+" "+s.name+" "+s.age+" ");
        }


    }
}
