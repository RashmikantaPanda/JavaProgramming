package com.java.basics.introduction;

public class RandomNoGenerate {
    public static void main(String[] args) {
        double a=Math.random();
        System.out.println(a);
        System.out.println(Math.random());
        int b= (int) (Math.random()*(100));
        System.out.println(b);
        //System.out.println(((int)Math.random()*(6-1+1)+1));

    }
}
