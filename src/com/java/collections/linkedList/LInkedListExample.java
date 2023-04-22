package com.java.collections.linkedList;

import java.util.LinkedList;

public class LInkedListExample {
    public static void main(String[] args) {
        //Create LinkedList
        LinkedList <String> list=new LinkedList<String>();

        //add element to the list
        list.add("Rashmi");
        list.add("Jyoti");
        list.add("Sourav");
        list.add("Jitesh");
        list.add("Mitesh");
        System.out.println(list);

        //adding at specific index
        list.add(2,"Surya");
        System.out.println(list);

        //Create another linkedList
        LinkedList <String> list1=new LinkedList<String>();
        list1.add("Umakanta");
        list1.add("Priyaranjan");
        list1.add("Sumanta");
        list1.add("Rahul");

        //addAll(Collection c)
        list.addAll(list1);
        System.out.println(list);







    }
}
