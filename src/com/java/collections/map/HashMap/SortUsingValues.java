package com.java.collections.map.HashMap;

import java.util.*;

public class SortUsingValues {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(17, "Rashmikanta");
        hashMap.put(18, "Sourabha");
        hashMap.put(3, "Jitesh");
        hashMap.put(7, "Mitesh");
        hashMap.put(13, "Jyotibikash");
        hashMap.put(16, "Barenya");
        System.out.println("Before Sorting ");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("----------------------");
        System.out.println("After sorting (values) ");
        Map<Integer, String> map = sortByValues(hashMap);
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    private static HashMap sortByValues(HashMap map) {
        List list = new LinkedList(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }


            /*@Override
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
            }*/


        });

        //Copy to listHashMap for preserve the insertion order
        HashMap sortedHashMap = new LinkedHashMap();
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }
}
