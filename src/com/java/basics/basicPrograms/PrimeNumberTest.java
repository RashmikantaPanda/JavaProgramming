package com.java.basics.introduction;

import java.util.Scanner;

public class PrimeNumberTest {
    public static void main(String[] args) {
        int i,n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number  : ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n+" is a prime number.");
        }
        else{
            System.out.println(n+" is not a prime number");
        }

    }
}
