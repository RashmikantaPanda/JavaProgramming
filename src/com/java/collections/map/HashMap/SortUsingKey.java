//Sorting Key of the hashMap using TreeMap
package com.java.collections.map.HashMap;

import java.util.*;

public class SortUsingKey {

    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(17,"Rashmikanta");
        hashMap.put(18, "Sourabha");
        hashMap.put(3, "Jitesh");
        hashMap.put(7, "Mitesh");
        hashMap.put(13, "Jyotibikash");
        hashMap.put(16, "Barenya");
        System.out.println("Before sorting : ");
        for (Map.Entry entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("--------------------");
        //Create another Map (TreeMap) to sort the key
        TreeMap<Integer,String> tMap=new TreeMap<>(hashMap);
        System.out.println("After sorting : ");
        for(Map.Entry mEntry:tMap.entrySet()){
            System.out.println(mEntry.getKey()+" "+mEntry.getValue());
        }






    }
}
