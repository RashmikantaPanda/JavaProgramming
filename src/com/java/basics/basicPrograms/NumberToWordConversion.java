//Number to Word Conversion
package com.java.basics.introduction;
import java.util.Scanner;
public class NumberToWordConversion {

    // Strings at index 0 is not used, it is to make array
    // indexing simple
    static String[] one = { "", "one ", "two ", "three ", "four ",
            "five ", "six ", "seven ", "eight ",
            "nine ", "ten ", "eleven ", "twelve ",
            "thirteen ", "fourteen ", "fifteen ",
            "sixteen ", "seventeen ", "eighteen ",
            "nineteen " };

    static String[] ten = { "", "", "twenty ", "thirty ", "forty ",
            "fifty ", "sixty ", "seventy ", "eighty ",
            "ninety " };

    static String numToWords(int n, String s)
    {
        String str = "";
        // if n is more than 19, divide it
        if (n > 19) {
            str += ten[n / 10] + one[n % 10];
        }
        else {
            str += one[n];
        }

        // if n is non-zero
        if (n != 0) {
            str += s;
        }

        return str;
    }

    // Function to print a given number in words
    static String convertToWords(long n)
    {
        // stores word representation of given number n
        String out = "";

        out += numToWords((int)(n / 10000000), "crore ");

        out += numToWords((int)((n / 100000) % 100), "lakh ");

        out += numToWords((int)((n / 1000) % 100), "thousand ");

        out += numToWords((int)((n / 100) % 10), "hundred ");

        if (n > 100 && n % 100 > 0) {
            out += "and ";
        }

         out += numToWords((int)(n % 100), "");

        return out;
    }

    public static void main(String[] args)
    {
        System.out.println("-----Number-To-Word-Conversion-----");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        long n =sc.nextLong();

        // convert given number in words
        System.out.print("\nWord Conversion  : ");
        System.out.println(convertToWords(n));
    }
}
