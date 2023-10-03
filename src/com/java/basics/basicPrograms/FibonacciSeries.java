package com.java.basics.introduction;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("-----Fibonacci Series-----");
        Scanner sc=new Scanner(System.in);
        System.out.println("How many terms you want ? ");
        int n = sc.nextInt();
        int first = 0, second = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.print(first + ", ");
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
    }
}
