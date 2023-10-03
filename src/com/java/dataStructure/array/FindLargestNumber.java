//Find the largest number using array
package com.java.basics.arrays;
import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many elements you want to insert : ");
        int n=sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elemets : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        for (int element:arr) {
            if(largest<element)
            {
                largest=element;
            }
        }
        System.out.println("Largest is : "+largest);
    }
}
