/*HashSet:
        Insertion order is not maintained
        Ignore the duplicate insertions
        */
package com.java.collections.set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args){
        HashSet<String> hashSet=new HashSet<String>();
        hashSet.add("Rashmikanta");
        hashSet.add("Sourabha");
        hashSet.add("Jyotibikash");
        hashSet.add("Suryakanta");

        System.out.println(hashSet);

        //Ignoring the duplicate insertion
        hashSet.add("Rashmikanta");
        System.out.print("After adding the duplicate \"Rashmikanta\" : ");
        System.out.println(hashSet);

        //remove element
        hashSet.remove("Sourabha");
        System.out.print("After removing \"Sourabha\": ");
        System.out.println(hashSet);

        //clone(), returns a shallow copy
        HashSet hs =(HashSet) hashSet.clone();
        System.out.println(hs);

        //contains()
        System.out.println(hashSet.contains("Rashmikanta"));

        //isEmpty()
        System.out.println(hashSet.isEmpty());

        //iterator()

        Iterator itr=hashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //size()
        System.out.println("Size of the HashSet is : "+hashSet.size());

        //remove(Obj o)
        System.out.println(hashSet.remove("Rashmikanta"));

        //clear()
        hashSet.clear();
        System.out.println(hashSet);

    }
}
