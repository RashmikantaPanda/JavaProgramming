package com.java.collections.list.vector;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ConvertListToVector {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<String>();
        vector.add("Rashmikanta");
        vector.add("Sourabha");
        vector.add("Jyotibikash");
        vector.add("Suryakanta");
        System.out.println("Vector elemets : "+vector);

        //converting vector to list
        List<String> list= Collections.list(vector.elements());
        System.out.println(list);

    }
}
