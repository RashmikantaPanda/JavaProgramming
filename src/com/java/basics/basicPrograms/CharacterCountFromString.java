//Count no of character present in a string(Excluding whitespace)
package com.java.basics.introduction;
import java.util.Scanner;

public class CharacterCountFromString {
    public static void main(String[] args) {
        System.out.println("-----Count no of Character in a String-----");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input=sc.nextLine();

        int count=0,i;
        for(i=0; i<input.length(); i++){
            if(input.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("Total character in the String is  : "+count);
    }
}
