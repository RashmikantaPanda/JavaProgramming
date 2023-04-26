package com.java.collections.map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(100,"Rashmikanta");
        linkedHashMap.put(300,"JyotiBikash");
        linkedHashMap.put(150,"Rashmikanta");
        linkedHashMap.put(200,"Jitesh");
        linkedHashMap.put(180,"Sourabha");

        //display  method-1
        System.out.println("\"LinkedHashMap\" maintains the insertion order.");
        Set<Integer> set=linkedHashMap.keySet();
        for (Integer i:set){
            System.out.println(i+" "+linkedHashMap.get(i));
        }
        System.out.println("------------------------");

        for (Map.Entry entry:linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        //remove(key)
        System.out.println();
        System.out.println("Removing the key \"150\" Its value is : "+linkedHashMap.remove(150));

    }
}
