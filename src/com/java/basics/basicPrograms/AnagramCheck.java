package com.java.basics.introduction;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        System.out.println("-----Check Anagram-----");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String : ");
        String input1=sc.next();
        System.out.println("Enter second String : ");
        String input2=sc.next();
        if(input1.length()==input2.length()){
            char[] str1=input1.toCharArray();
            char[] str2=input2.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            boolean result=Arrays.equals(str1,str2);
            if(result){
                System.out.println(input1+" and "+input2+" are Anagram");
            }
            else{
                System.out.println(input1+" and "+input2+" are not Anagram");
            }
        }
        else {
            System.out.println(input1+" and "+input2+" are not Anagram");
        }
    }
}
