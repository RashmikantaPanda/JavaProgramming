package com.java.thread;

public class ImplementingRunnableInterface implements Runnable {
    @Override
    public void run() {
        System.out.println("Sourav Is Running...");
    }


    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("Hi Rashmikanta");
            }
        };

        //Using Lamda Expression
        Runnable runnable1=()-> System.out.println("HI Priya");

        Thread t=new Thread(runnable1);
        Thread t2=new Thread(runnable, "MyThread");

        t2.start();
        System.out.println(t2.getName());
        t.start();
    }
}
