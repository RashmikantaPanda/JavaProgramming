package com.java.collections.set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("AB");
        linkedHashSet.add("ABC");
        linkedHashSet.add("A");
        linkedHashSet.add("AC");
        linkedHashSet.add("AD");
        linkedHashSet.add("CBA");

        System.out.println(linkedHashSet);
        //remove()
        System.out.println(linkedHashSet.remove("A"));

        LinkedHashSet<Integer> lhashSet=new LinkedHashSet<>();
        lhashSet.add(10);
        lhashSet.add(20);
        lhashSet.add(30);
        lhashSet.add(40);
        System.out.println(lhashSet);
    }
}
