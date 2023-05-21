/*
* Converting ArrayList to Array
*
*/
package com.java.collections.list.arrayList;

import java.util.ArrayList;

public class ArrayListToArrayConversion {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(150);
        list.add(200);
        list.add(250);
        list.add(300);

        /*
        * Using Object[] toArray()
        * toArray() method returns an array of Object type
        * */
        Object[] objArr=list.toArray();
        for(Object o:objArr){
            System.out.print(o+" ");
        }
        System.out.println();

        /*
        * Using T[] toArray(T[] a)
        * */
        Integer[] intArr=new Integer[list.size()];
        intArr=list.toArray(intArr);
        for(Integer i:intArr){
            System.out.print(i+" ");
        }
        System.out.println();

        /*
        * Using Manual Conversation
        * */
        int[] newArr=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            newArr[i]=list.get(i);
        }
        for(int i:newArr){
            System.out.print(i+" ");
        }


    }

}
