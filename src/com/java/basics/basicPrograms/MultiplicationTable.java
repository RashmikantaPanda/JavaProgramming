package com.java.basics.introduction;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Which multiplication table you want  ? ");
        number=sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(number+" x "+i+" = "+number*i);
        }
    }

}
