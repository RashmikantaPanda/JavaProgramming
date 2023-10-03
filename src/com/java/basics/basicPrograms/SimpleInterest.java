package com.java.basics.introduction;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("-------Simple Interest-------");
        float principal,time,interestRate;
        Scanner sc=new Scanner(System.in);
        System.out.println("Principal Amount  : ");
        principal=sc.nextFloat();
        System.out.println("Interest Rate : ");
        interestRate=sc.nextFloat();
        System.out.println("Year : ");
        time=sc.nextFloat();

        float simpleInterest=(principal*time*interestRate)/100;
        System.out.println("Interest Calculated : "+simpleInterest);
        System.out.println("Total balance will be : "+(simpleInterest+principal));
    }
}
