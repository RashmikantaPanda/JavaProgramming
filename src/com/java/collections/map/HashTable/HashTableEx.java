package com.java.collections.map.HashTable;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashTable=new Hashtable<Integer,String>();
        hashTable.put(150,"Rashmikanta");
        hashTable.put(120,"Sourabha");
        hashTable.put(100,"Jyotibikash");
        hashTable.put(110,"Suryakanta");

        System.out.println(hashTable);
        //or
        for(Integer i:hashTable.keySet()){
            System.out.println(i+" "+hashTable.get(i));
        }

        //hashcode()
        System.out.println(hashTable.hashCode());

        //getOrDefault(), if available returns the value else returns the default string
        System.out.println(hashTable.getOrDefault(120,"Not Available"));
        System.out.println(hashTable.getOrDefault(125,"Not Available"));

        //putIfAbsent(), It will put the data if it is not present in the existing table and return ture, otherwise return false
        System.out.println(hashTable.putIfAbsent(350,"BarenyaBinayak"));
        System.out.println(hashTable.putIfAbsent(150,"Rashmikanta"));
        System.out.println(hashTable);



        //compute(), computes a new value to the key if it is present, else it will add the new value to the map
        hashTable.compute(150,(key,val)->val+" Panda");
        hashTable.compute(160,(key,val)->"RK Panda");
        System.out.println(hashTable);

        //values(), returns the collection of values
        System.out.println(hashTable.values());


        //remove(key), it will return the value
        //remove(key,Value), it will return true if the given k,v is present, otherwise false
        System.out.println();
        System.out.println(hashTable.remove(100));
        System.out.println(hashTable.remove(110,"Suryakanta"));
        int a=90;
        System.out.println();


    }
}
