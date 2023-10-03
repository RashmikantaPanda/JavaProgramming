package com.java.basics.arrays;

import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args){
        System.out.println("-------Find duplicate elements in an array-------");
        Scanner sc=new Scanner(System.in);
        System.out.println("How many elements you want to insert in the array ? ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Finding duplicate elements : ");
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
