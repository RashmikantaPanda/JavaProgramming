package com.java.collections.list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayListConversion {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 10, 5, 4, 6, 15, 5, 2, 6, 3, 5, 9, 6, 3, 5, 11, 22, 4};
        /**
         *  Method1, Using Arrays.asList()
         *  But we can't add more elements after converting array to list
         */
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);
        //list.add(100); //We can't add more element to the list, because now it became a fixed length array

        /**
         * Method2, Using Arrays.asList()
         * Creating arraylist by passing Arrays.asList(array) as an argument
         * */
        ArrayList<Integer> li = new ArrayList<Integer>(Arrays.asList(arr));

        //Method3, Using Collections.addAll()
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, arr);

        //Method4, adding each element using loop
        ArrayList<Integer> list2=new ArrayList<>();
        for(Integer item:arr){
            list2.add(item);
        }
        System.out.println(list2);

    }
}
