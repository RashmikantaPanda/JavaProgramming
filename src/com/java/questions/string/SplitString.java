package com.java.questions.string;

public class SplitString {
    public static void main(String[] args) {
        String str="Hello, every. one; My name is :Rashmikanta. Panda% I am pursuing my :MCA: at utkal University";
        String camelCaseStr=camelCase(str);
        System.out.println(camelCaseStr);
    }

    private static String camelCase(String str) {
        String[] strArr=str.split("[:%*;,-_.+-]");
        //String[] strArr=str.split("[:%*;,_+.-]");

        String camCase="";
        for(int i=0; i<strArr.length; i++){
            camCase=camCase+strArr[i];
        }

        return camCase;
    }
}
