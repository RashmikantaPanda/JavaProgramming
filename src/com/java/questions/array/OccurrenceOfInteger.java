/**
 * Given an array of Integers.
 * We have to find the occurrence of each number in that array.
 * Solution->
 * 1. Using Native technique
 * 2. We can use Map<Integer,Integer>
 */
package com.java.questions.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfInteger {
    public static void main(String[] args) {
        System.out.println("No of Occurrence of Each Numbers\n");
        int[] arr={2,2,1,3,2,1,2,3,5,2,4,6,5,8,9,5,7,5,6,5,4,2,1,2,3,2,1,2,5,4,8,6,5,4};
        System.out.println(Arrays.toString(arr));
        usingNativeMethod(arr);
        usingMap(arr);

    }
    public static void usingNativeMethod(int[] arr) {
        int [] fr = new int [arr.length];
        int visited = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    //To avoid counting same element again
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }

        System.out.println(" ---Using Native Method--- ");
        for (int i=0; i<fr.length; i++){
            if(fr[i]!=-1)
                System.out.println(arr[i]+" ---> "+fr[i]+" times.");
        }
    }
    public static void usingMap(int[] arr) {
        Map<Integer, Integer> map=new HashMap<>();

        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }

        System.out.println(" ---Using Collections(Map)--- ");
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" ---> "+entry.getValue()+" times.");
        }
    }
}
