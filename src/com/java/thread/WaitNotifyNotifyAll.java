package com.java.thread;

class Customer {
    int amount = 1000;

    synchronized void withdraw(int amount) {
        System.out.println("Going to Withdraw...");
        if (this.amount < amount) {
            System.out.println("Low Balance. Waiting for deposit...");

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        this.amount=this.amount-amount;
        System.out.println("Withdraw Completed");
    }

    synchronized void deposit(int amount){
        System.out.println("Going to Deposit...");
        this.amount=this.amount+amount;
        System.out.println("Deposit Completed");
        notify();
    }
}

public class WaitNotifyNotifyAll {
    public static void main(String[] args){
        Customer customer=new Customer();
        new Thread(){
            public void run(){
                customer.withdraw(15000);
            }
        }.start();

        //OR
        //        new Thread(() -> customer.withdraw(15000)).start();


        new Thread(){
            public void run(){
                customer.deposit(1000);
            }
        }.start();
    }

}
