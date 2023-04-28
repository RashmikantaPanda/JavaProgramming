package com.java.exceptionHandling.TryCatch;

import java.util.Arrays;
import java.util.Scanner;

public class TryCatchExample {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        arithmeticExceptionEx();
        arrayIndexOutOfBoundException();
        nullPointerException();
    }
    static void arithmeticExceptionEx(){
        System.out.println("Enter a & b :");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            System.out.println("a/b = "+a/b);
        }
        catch (ArithmeticException ae){
            System.out.println(ae.getMessage()+" is not possible");
        }
    }

    static void arrayIndexOutOfBoundException(){
        try {
            int[] arr={100,200,300,400,500,600,700,800,900,1000};
            System.out.println(Arrays.toString(arr));
            System.out.println("Enter the index no you want to display : ");
            int index=sc.nextInt();
            System.out.println("Value at index "+index+" is : "+arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException aobe){
            System.out.println("Index "+aobe.getMessage()+" is not available");
        }
    }

    static void nullPointerException(){

        String name=sc.next("1232");
        try{
            System.out.println(name.equals("Rashmikanta"));
        }
        catch (NullPointerException npe){
            System.out.println(""+" "+npe);
        }
    }

}
