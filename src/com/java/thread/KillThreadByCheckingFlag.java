package com.java.thread;

public class KillThreadByCheckingFlag implements Runnable{
    private  boolean flag=false;
    private Thread worker;

    public void stop(){
        flag=true;
    }
    public void start(){
        worker=new Thread(this);
        worker.start();
    }

    @Override
    public void run() {
        while(!flag){
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName()+" Running...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName()+" Stopped.");
    }

    public static void main(String[] args) {
        /*KillThreadByCheckingFlag t1=new KillThreadByCheckingFlag();
        KillThreadByCheckingFlag t2=new KillThreadByCheckingFlag();

        Thread task1=new Thread(t1);
        Thread task2=new Thread(t2);*/
        KillThreadByCheckingFlag task1=new KillThreadByCheckingFlag();
        KillThreadByCheckingFlag task2=new KillThreadByCheckingFlag();
        task1.start();
        task2.start();
        try {
            Thread.sleep(1000);
            task1.stop();
            task2.stop();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
