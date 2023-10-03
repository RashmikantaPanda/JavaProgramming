package com.java.basics.patternPrint;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        int i,j,row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size : ");
        row=sc.nextInt();
        for(i=0;i<row;i++){
            for(j=row-1;j>i;j--){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
