package com.java.collections.set.TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(50);
        treeSet.add(40);

        //displaying the set (It will display the elements in ascending order)
        System.out.println(treeSet);
        for (Integer i:treeSet){
            System.out.print(i+" ");
        }
        System.out.println();
        //To display in descending order we can use - descendingSet()
        System.out.println(treeSet.descendingSet());
        //OR
        Iterator<Integer> itr=treeSet.descendingIterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();

        //pollFirst(), retrieves and removes the last (highest) element
        // pollLast(), retrieves and removes the first
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());
        System.out.println(treeSet);

        //Adding another treeSet to the existing
        Set<Integer> tSet=new TreeSet<>();
        tSet.add(120);
        tSet.add(200);
        tSet.add(210);
        treeSet.addAll(tSet);
        System.out.println(treeSet);
    }
}
