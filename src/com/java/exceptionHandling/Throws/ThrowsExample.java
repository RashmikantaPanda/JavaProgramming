package com.java.exceptionHandling.Throws;

import java.util.Scanner;

public class ThrowsExample {
    static  int a;
    static int b;
    static int result;
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Inside main() method");
        method1();
        System.out.println("Work Done");
    }
    static void method1(){
        System.out.println("Inside Mehtod1");
        try{
            method2();
        }
        catch (ArithmeticException e){
            System.out.println("Not Possible");
            System.out.println("Enter b : ");
            int b=sc.nextInt();
            int result=a/b;
            System.out.println("Result is : "+result);
        }

        System.out.println("Method2 called Successfully");
    }

    static void method2()throws ArithmeticException{
        /*
        here, method2() is not handling the exception
         rather it is throws to the calling function method1()
         */
        System.out.println("Inside method2");
        System.out.println("We are performing Division Operation");
        System.out.println("Enter a : ");
        a=sc.nextInt();
        System.out.println("Enter b : ");
        b=sc.nextInt();
        result=a/b;
        System.out.println("Result is : "+result);

    }
}
