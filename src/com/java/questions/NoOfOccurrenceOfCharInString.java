
/**
 * Given a String. We have to find number of occurrence of each character in that String.
 * Here we have used two method to find the no. of characters
 * 1. Native Method(Using ASCII value)
 * 2. Using HashMap
 * (In both cases we are eliminating the whitespace character(s) )
 */

package com.java.questions;

import java.util.HashMap;
import java.util.Map;

public class NoOfOccurrenceOfCharInString {
    public static void main(String[] args) {
        String str = "Hello Everyone I am Rashmikatna";
        System.out.println("String is : " + str);

        usingAsciiValue(str); //Using native method
        usingHashMap(str); //Using HashMap class

    }

    static void usingAsciiValue(String str) {
        System.out.println("-----Using Native Method-------");
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]!=0 && (char)i!=' ')   //eliminating other characters and whiteSpace
            {
                //if ((char) count[i] == 'a' || (char) count[i] == 'e' || (char) count[i] == 'i' ||(char)  count[i] == 'o' || (char) count[i] == 'u')
                System.out.println((char) i + " : " + count[i]);

            }
        }


    }
    static void usingHashMap (String str){
        System.out.println("-------Using HashMap-------");

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (hashMap.containsKey(str.charAt(i))) {
                int count = hashMap.get(str.charAt(i));
                hashMap.put(str.charAt(i), ++count);
            } else {
                hashMap.put(str.charAt(i), 1);
            }
        }
        char c = ' ';
        hashMap.remove(c); //removing the while space

        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            System.out.print(entry.getKey() + " : " + entry.getValue() + "\n");


        }
    }
}
