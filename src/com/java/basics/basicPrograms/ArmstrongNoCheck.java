package com.java.basics.introduction;

import java.util.Scanner;

public class ArmstrongNoCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number  : ");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if(temp==sum){
            System.out.println(temp+" is an Armstrong number.");
        }
        else
            System.out.println(temp+" is not an Armstrong number");
    }
}
