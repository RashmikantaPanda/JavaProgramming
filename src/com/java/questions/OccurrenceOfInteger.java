/**
 * Given an array of Integers.
 * We have to find the occurrence of each number in that array.
 * Solution-> We can use Map<Integer,Integer>
 */
package com.java.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfInteger {
    public static void main(String[] args) {
        int[] arr={2,2,1,3,2,1,2,3,5,2,4,6,5,8,9,5,7,5,6,5,4,2,1,2,3,2,1,2,5,4,8,6,5,4};
        Map<Integer, Integer> map=new HashMap<>();

        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }

        System.out.println(Arrays.toString(arr));
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" is "+entry.getValue()+" times.");
        }
    }
}
