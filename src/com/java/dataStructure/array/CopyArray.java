package com.java.basics.arrays;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args){
        System.out.println("-------Copy one array to another array-------");
        Scanner sc=new Scanner(System.in);
        System.out.println("How many elements you want to insert in the array ? ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr2=new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr2.length);
        System.out.println("Duplicate Array is  : ");
        for (int j : arr2) {
            System.out.print(j + " ");
        }
    }
}
