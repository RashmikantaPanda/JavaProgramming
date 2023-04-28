package com.java.exceptionHandling.TryCatch;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleCatchBlockEx {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int a=100;
            System.out.println("Enter the denominator :");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println("a/b : "+c);

            int[] arr={10,20,30,40,50,60,70,80,90,100};
            System.out.println(Arrays.toString(arr));
            System.out.println("Enter the index you want to access : ");
            int index=sc.nextInt();
            System.out.println("Value is : "+arr[index]);
        }
        catch (ArithmeticException ae){
            System.out.println("Division by zero not possible");
        }
        catch (ArrayIndexOutOfBoundsException aobe){
            System.out.println("Accessing illegal index of the array");
        }

    }
}
