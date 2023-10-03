/*
 Divide Strings into 'n' equal parts(including whiteSpace)
    */
package com.java.basics.introduction;

import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String   :  ");
        String inpStr=sc.nextLine();
        int len=inpStr.length();
        System.out.println("How many parts you want to divide this string : ");
        int n=sc.nextInt();
        int temp=0,equalPart=len/n;
        String[] equalStr=new String[n];
        if(len%n!=0){
            System.out.println("This string cannot be divide into equal parts.");
        }
        else {
            for(int i=0; i<len; i+=equalPart){
                String part=inpStr.substring(i,i+equalPart);
                equalStr[temp]=part;
                temp++;
            }
            System.out.println("Equal Parts are : ");
            for(int i=0; i<n; i++)
            {
                System.out.println(equalStr[i]);
            }
        }
    }
}
