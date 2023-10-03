//There is a String S of lowercase English letters that is repeated infinitely many times.Given an integer n, find
//and print the number of a given letter in the infinite String.

package languageJava;

import java.util.Scanner;

public class LetterCount {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.next();
        System.out.println("How many time you want to repeat the sting : ");
        int n=sc.nextInt();
        String str1 ="";
        for (int i=0; i<n; i++){
            str1=str1.concat(str.toLowerCase());
        }
        int count=0;
        System.out.println(str1);
        //Char arr[]=str1.toCharArray();
        System.out.println("Enter the character you want to search : ");
        char ch=sc.next().charAt(0);
        for (int i=0; i<str1.length();i++){
            if(str1.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("Number of "+ch+" in this string is : "+count);



    }
}
