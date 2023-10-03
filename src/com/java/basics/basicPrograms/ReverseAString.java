package com.java.basics.introduction;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String  : ");
        String str=sc.next();
        System.out.println("Oringinal String is : "+str);
        System.out.print("Reversed String is : ");
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
