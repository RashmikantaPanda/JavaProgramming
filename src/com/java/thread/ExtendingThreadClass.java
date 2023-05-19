package com.java.thread;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.sleep;

class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hii");
           /* try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }*/

        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
           /* try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
    }
}

public class ExtendingThreadClass {

    public static void main(String[] args) throws InterruptedException {
        A ob1 = new A();
        ob1.setPriority(MAX_PRIORITY);
        B ob2 = new B();

        ob1.start();
        ob2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
            sleep(1);
        }

        System.out.println("Main Thread Priority : " + Thread.currentThread().getPriority());
        System.out.println("Ob1 Priority : " + ob1.getPriority());

        System.out.println("Ob1 New Priority : " + ob1.getPriority());

        Thread t1=new Thread("MyThread1");
        System.out.println(t1.getId()+" "+t1.getName()+" "+t1.getState());

    }
}
