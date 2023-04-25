package com.java.collections.map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(13, "Jyotibikash");
        hashMap.put(17, "Rashmikanta");
        hashMap.put(18, "Sourabha");
        hashMap.put(3, "Jitesh");
        hashMap.put(7, "Mitesh");
        //adding duplicate
        hashMap.put(17, "Rashmi");

        //printing
        System.out.println("Displaying the HashMap");
        System.out.println(hashMap);
        //display using keySet()
        Set<Integer> key = hashMap.keySet();
        for (Integer i : key) {
            System.out.println(i + " : " + hashMap.get(i));
        }
        System.out.println("------------------------");
        //display using Map.Entry  entrySet()
        for (Map.Entry mEntry : hashMap.entrySet()) {
            System.out.println(mEntry.getKey() + " " + mEntry.getValue());
        }
        System.out.println("-----------------------------");
        //Iterator
        Set set=hashMap.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry entry= (Map.Entry) itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        //remove
        System.out.println("After removing the key 7 ");
        hashMap.remove(7);
        Set<Integer> key1 = hashMap.keySet();
        for (Integer j : key1) {
            System.out.println(j + " " + hashMap.get(j));
        }
        System.out.println("-----------------------------");

        //repalce()
        System.out.println("Replacing Rashmi as Rashmikanta ");
        hashMap.replace(17, "Rashmi", "Rashmikanta");
        for (Map.Entry mEntry : hashMap.entrySet()) {
            System.out.println(mEntry.getKey() + " " + mEntry.getValue());
        }
        System.out.println("-----------------------------");

        //clone()
        System.out.println("Cloning a hashmap to another ");
        HashMap<Integer, String> hMap1 = (HashMap<Integer, String>) hashMap.clone();
        for (Map.Entry me : hMap1.entrySet()) {
            System.out.println(me.getKey() + " " + me.getValue());
        }
        System.out.println("-----------------------------");
        //containsKey(Object key)
        System.out.println("Contains key 13 ? " + hashMap.containsKey(13));

        System.out.println("-----------------------------");
        //containsValue(object value)
        System.out.println("Contains value : Rashmikanta ? " + hashMap.containsValue("Rashmikanta"));

        System.out.println("-----------------------------");
        //Set keySet(), returns the keys from the map
        System.out.println("KeySet : "+hashMap.keySet());

        System.out.println("-----------------------------");
        System.out.println("Values : "+hashMap.values());

        System.out.println("-----------------------------");
        //size()
        System.out.println("Size of HashMap : "+hashMap.size());


    }

}
