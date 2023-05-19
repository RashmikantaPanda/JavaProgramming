package com.java.thread;

public class KillThreadByInterruptingThread implements Runnable {
    private Thread worker;

    public void start() {
        worker = new Thread(this);
        worker.start();
    }

    public void interrupt() {
        worker.interrupt();
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " is Running...");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted with reason : "+e.getMessage());
            }
        }
        System.out.println(Thread.currentThread().getName() + " is Stopped.");

    }

    public static void main(String[] args) {
        KillThreadByInterruptingThread task1 = new KillThreadByInterruptingThread();
        KillThreadByInterruptingThread task2 = new KillThreadByInterruptingThread();

        task1.start();
        task2.start();
        try {
            Thread.sleep(1000);
            task1.interrupt();
            task2.interrupt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
