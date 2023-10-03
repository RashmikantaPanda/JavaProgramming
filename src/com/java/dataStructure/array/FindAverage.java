//Find average using array
package com.java.basics.arrays;

import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many elements you want to insert : ");
        int n=sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elemets : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int element:arr) {
            sum=sum+element;
        }
        int avg=sum/arr.length;
        System.out.println("Average is : "+avg);
    }
}
