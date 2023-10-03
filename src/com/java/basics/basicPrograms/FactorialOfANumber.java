package com.java.basics.introduction;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        System.out.println("-----Factorial of a Number-----");
        System.out.println("Enter a number to find it's factorial : ");
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int i = 1;
        long factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of "+num+" = "+factorial);
    }
}
