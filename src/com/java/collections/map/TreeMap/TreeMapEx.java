package com.java.collections.map.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer,String> tMap=new TreeMap<>();
        tMap.put(17,"Rashmikanta");
        tMap.put(18, "Sourabha");
        tMap.put(3, "Jitesh");
        tMap.put(7, "Mitesh");
        tMap.put(13, "Jyotibikash");

        //dispaly
        System.out.println(tMap);

        for(Map.Entry mEntry: tMap.entrySet()){
            System.out.println(mEntry.getKey()+" "+mEntry.getValue());
        }

    }
}
