package com.java.basics.introduction;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        char ch1;
        int asciiVal,switchValue=1;
        Scanner sc = new Scanner(System.in);

        while (switchValue!=3) {
            System.out.println(" What do you want to do ? ");
            System.out.println(" 1. Enter ASCII value & find its character value  ");
            System.out.println(" 2. Enter character value & find its ASCII value ");
            System.out.println(" 3. Exit");
            switchValue = sc.nextInt();
            switch (switchValue) {
                case 1:
                    System.out.println("Enter ASCII value : ");
                    asciiVal=sc.nextInt();
                    ch1= (char) asciiVal;
                    System.out.println("Character value is : "+ch1);
                    break;

                case 2:
                    System.out.println("Enter a character : ");
                    ch1 = sc.next().charAt(0);
                    asciiVal = ch1;
                    System.out.println("ASCII value is : " + asciiVal);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Enter a valid input");
            }
        }

    }
}
