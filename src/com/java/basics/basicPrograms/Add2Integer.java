package com.java.basics.introduction;

import java.util.Scanner;

public class Add2Integer {
    public static void main(String[] args) {
        int number1,number2;
        System.out.println("Enter two integers : ");
        Scanner sc=new Scanner(System.in);
        number1=sc.nextInt();
        number2=sc.nextInt();
        int sum=number1+number2;
        System.out.println("Result is  : "+sum);
    }
}
