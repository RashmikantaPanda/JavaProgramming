package com.java.exceptionHandling.Throw;

import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Your Name : ");
        String name=sc.next();
        System.out.println("Enter your age : ");
        int age=sc.nextInt();

        try {
            if(age<18){
                throw new ArithmeticException("Your age should must be greate than 18 ");
            }
            else {
                System.out.println("Hlw "+name+" you are eligible for voting.");
            }
        }
        catch (ArithmeticException e){
            System.out.println("You are not eligible to vote.\n"+e.getMessage());
        }



    }
}
