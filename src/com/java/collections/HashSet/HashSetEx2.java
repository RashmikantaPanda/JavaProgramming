package com.java.collections.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
        li.add(100);
        li.add(101);
        li.add(102);
        li.add(103);
        li.add(104);
        li.add(105);
        System.out.println("The ArrayList contains : "+li);

        HashSet<Integer> hashSet=new HashSet<>(li);
        hashSet.add(500);
        hashSet.add(700);
        hashSet.add(500);
        System.out.println("The HashSet Contains : "+hashSet);

    }
}
