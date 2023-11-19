package com.java.questions.array;//Reverse an array using swapping(without using an duplicate array)


import java.util.Scanner;

public class ReverseArray {
    static void reverse(int[] arr){
        int temp;
        int n= arr.length;
        for(int i=0; i<n/2; i++){
            temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;

        }
        System.out.println("After Reversing the array : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args){
        System.out.println("-------Reverse an Array-------");
        Scanner sc=new Scanner(System.in);
        System.out.println("How many elements you want to enter ?");
        int n=sc.nextInt();
        int[] inputArr=new int[n];
        System.out.println("Enter "+n+" elements : ");
        for (int i=0; i<n; i++){
            inputArr[i]=sc.nextInt();
        }

        reverse(inputArr);
    }
}
