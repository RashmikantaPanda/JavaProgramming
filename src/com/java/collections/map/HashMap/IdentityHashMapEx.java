/*
    IdentityHashMap is a class that implements the Map interface.
    It is similar to the HashMap class, with the main difference
    being that IdentityHashMap uses reference equality instead of
    object equality when comparing keys.
*/
package com.java.collections.map.HashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapEx {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        IdentityHashMap<String,Integer> identityHashMap=new IdentityHashMap<>();

        hashMap.put("Rashmikanta",100);
        hashMap.put("Rashmikanta",500);//It will treat "Rashmikanta" as duplicate key and 'll update the new value (here 500)
        hashMap.put("JyotiBikash",200);
        hashMap.put("Sourabha",150);

        /*
        * IdentityHashMap uses the == operator to compare the keys.
        * This means that in an IdentityHashMap, two keys are considered equal if and only if
        * they are the same object, rather than being equal in terms of their contents.
        * */
        identityHashMap.put("Rashmikanta",100);
        identityHashMap.put(new String("Rashmikanta"),500);//It will treat "Rashmikanta" as different object
        identityHashMap.put("JyotiBikash",200);
        identityHashMap.put("Sourabha",150);


        System.out.println("Size of Hashmap : "+hashMap.size());
        System.out.println("Size of IdentityHashMap : "+identityHashMap.size());

        System.out.println("HashMap Elements are  : ");
        for (Map.Entry<String, Integer> mEntry:hashMap.entrySet()){
            System.out.println(mEntry.getKey()+" "+mEntry.getValue());
        }

        System.out.println("Identiy HashMap elements are : ");
        for(Map.Entry<String, Integer> mEntry:identityHashMap.entrySet()){
            System.out.println(mEntry.getKey()+" "+mEntry.getValue());
        }



    }
}
