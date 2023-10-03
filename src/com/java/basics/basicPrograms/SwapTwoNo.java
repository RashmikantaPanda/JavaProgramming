//Swapping Two Numbers
package com.java.basics.introduction;

import java.util.Scanner;

public class SwapTwoNo {

    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("Before Swapping value of num1 = "+num1+" value of num2 = "+num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping value of num1 = "+num1+" value of num2 = "+num2);
    }
}
