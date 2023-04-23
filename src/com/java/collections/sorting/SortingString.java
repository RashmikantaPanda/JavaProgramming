package com.java.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortingString {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<String>();
        list1.add("Rashmi");
        list1.add("Avijit");
        list1.add("Sourav");
        list1.add("Jyoti");

        System.out.println("Before Sorting : ");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println("After Sorting : ");
        System.out.println(list1);

        //Sorting in Reverse Order
        System.out.println("Sorting in Reverse Order");
        list1.sort(Collections.reverseOrder());
        System.out.println(list1);
    }
}
