package com.java.basics.introduction;

import java.util.Scanner;

public class CompoudInterest {
    public static void main(String[] args) {
        System.out.println("-------Compound Interest-------");
        float principal,time,interestRate;
        Scanner sc=new Scanner(System.in);
        System.out.println("Principal Amount  : ");
        principal=sc.nextFloat();
        System.out.println("Interest Rate : ");
        interestRate=sc.nextFloat();
        System.out.println("Year : ");
        time=sc.nextFloat();
        float t;
        for(t=1; t<=time; t++) {
            float interest = (principal * t * interestRate) / 100;
            principal=principal+interest;
            System.out.println("For year "+t+" Interest Calculated : "+interest);
        }
        System.out.println("Total balance will be : "+(principal));
    }
}
