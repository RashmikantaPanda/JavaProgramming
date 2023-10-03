//Perferm linearSearch to find an element of an array
package com.java.basics.dataStructure.array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("-------Linear Search-------");
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 11, 89, 45, 32, 15, 48, 9, 17, 45, 67};
        int key;
        boolean found = false;
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println("\nWhat you want to search ?");
        key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(key + " is found at location " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(key + " is not present in this array.");
        }
    }
}