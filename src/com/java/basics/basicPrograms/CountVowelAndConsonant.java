//Count no of vowel and consonant in a Sentence
package com.java.basics.introduction;

import java.util.Scanner;

public class CountVowelAndConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        str=str.toLowerCase();
        int vCount=0,cCount=0;

        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cCount++;
            }
        }
        System.out.println("Vowel : "+vCount);
        System.out.println("Consonant : "+cCount);
    }
}
