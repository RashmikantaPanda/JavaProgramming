//Sorting using comparator interface, Here we have used the Student class which is present in another file
//Non-generic comparator (Old Style)
package com.java.collections.list.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class AgeComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Student s1= (Student) o1;
        Student s2= (Student) o2;
        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }

    @Override
    public Comparator reversed() {
        return Comparator.super.reversed();
    }
}

class NameComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student)o1;
        Student s2=(Student)o2;

        return s1.name.compareTo(s2.name);
    }

    @Override
    public Comparator reversed() {
        return Comparator.super.reversed();
    }
}
public class NonGenericComparator {
    public static void main(String[] args) {
        ArrayList <Student> li=new ArrayList<Student>();

        li.add(new Student(100,"Rashmikanta",23));
        li.add(new Student(145,"Sourabha",29));
        li.add(new Student(110,"JyotiBikash",23));
        li.add(new Student(120,"Suryakanta",22));
        li.add(new Student(115,"Barenyabinayak",24));

        System.out.println("Default List : ");
        for (Student s:li){
            System.out.println(s.rollno+" "+s.name+" "+s.age+" ");
        }
        System.out.println("------------------------");
        System.out.println("Sorting by Age ");
        Collections.sort(li,new AgeComparator());
        for (Student s:li){
            System.out.println(s.rollno+" "+s.name+" "+s.age+" ");
        }
        System.out.println("------------------------");
        System.out.println("Sorting by Name ");
        Collections.sort(li,new NameComparator());
        /*for (Student s:li){
            System.out.println(s.rollno+" "+s.name+" "+s.age+" ");
        }*/
        //we can also use Iterator
        Iterator<Student> iterator=li.iterator();
        while(iterator.hasNext()) {
            Student stud = (Student) iterator.next();
            System.out.println(stud.rollno+" "+stud.name+" "+stud.age);
        }

        System.out.println("------------------------");
        System.out.println("Sorting by Name in Reversed Order ");
        Collections.sort(li,new NameComparator().reversed());
        for (Student s:li){
            System.out.println(s.rollno+" "+s.name+" "+s.age+" ");
        }





    }
}
