//Sorting a HashMap based on value using lamda expression
package com.java.collections.map.HashMap;

import java.util.*;

class Student{
    int roll;
    String name;
    int age;
    int mark;

    public Student(int roll, String name, int age, int mark) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
}

public class SortByValueUsingLamda {
    public static void main(String[] args) {
        Student s1=new Student(100,"Rashmikanta",25,399);
        Student s2=new Student(120,"Jyotibikash",22,450);
        Student s3=new Student(104,"Sourabha",21,350);
        Student s4=new Student(102,"Surya",23,490);

        HashMap<Integer,Student> hMap=new HashMap<>();
        hMap.put(8000,s1);
        hMap.put(7000,s2);
        hMap.put(9000,s3);
        hMap.put(5000,s4);

        System.out.println("Map contains : ");
        Set<Integer> s=hMap.keySet();
        for (Integer key:s){
            System.out.println(key+" "+hMap.get(key).roll+" "+hMap.get(key).name+" "+hMap.get(key).age+" "+hMap.get(key).mark);
        }

        System.out.println("Sorting");
        Map<Integer, Student> map=sortByValue(hMap);


    }
    public static HashMap<Integer,Student> sortByValue(HashMap<Integer, Student> map){
        List<Map.Entry<Integer,Student>> list=new LinkedList<Map.Entry<Integer,Student>>(map.entrySet());


        //Doubt
        Collections.sort(list,(l1,l2)->(l1.getValue().name).compareTo(l2.getValue().name));
        HashMap<Integer,Student> hashMap=new LinkedHashMap<>();
        for (Map.Entry<Integer,Student> me:list){
            hashMap.put(me.getKey(), me.getValue());
        }
        return hashMap;


    }


}
