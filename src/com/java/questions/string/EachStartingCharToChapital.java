package com.java.questions.string;

/**
 * Given a sentence , we have to make each letter of that sentence to Capital Letter.
 * input - hi all I am Rashmikanta panda
 * output - Hi All I Am Rashmikanta Panda
 */
public class EachStartingCharToChapital {
    public static void main(String[] args) {
        String str="hi i am rashmikanta Panda A student of Utkal university";
        System.out.println("Original String : "+str);
        String[] strArr=str.split(" ");
        System.out.println("After convertring each initial character : ");
        for(int i=0; i<strArr.length; i++){
            System.out.print(String.valueOf(strArr[i].charAt(0)).toUpperCase());
            for(int j=1; j<strArr[i].length(); j++){
                System.out.print(strArr[i].charAt(j));
            }
            System.out.print(" ");

        }

    }
}