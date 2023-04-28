package com.java.exceptionHandling.TryCatch;

import java.util.Arrays;
import java.util.Scanner;

public class NestedTryCatchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            try {
                int a = 100;
                System.out.println("Enter the denominator :");
                int b = sc.nextInt();
                int c = a / b;
                System.out.println("a/b : " + c);

            }
            catch (ArithmeticException ae){
                System.out.println("Division by zero not possible");
            }
            finally { //It must be executed
                try {
                    String name=null;
                    System.out.println(name.equals("Rashmikanta"));
                }
                catch (NullPointerException npe){
                    System.out.println("Null Pointer Exception");
                }
                finally { //It is also be executed
                    System.out.println("RK Panda");
                }
            }

            try {
                int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
                System.out.println(Arrays.toString(arr));
                System.out.println("Enter the index you want to access : ");
                int index = sc.nextInt();
                System.out.println("Value is : " + arr[index]);
            } catch (ArrayIndexOutOfBoundsException aobe) {
                System.out.println("Accessing illegal index.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
