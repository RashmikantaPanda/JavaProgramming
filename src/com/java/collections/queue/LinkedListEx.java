package com.java.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx{
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<Integer>();

        //add elements to the queue
        q.add(100);
        q.add(200);
        q.add(50);
        q.add(150);

        System.out.println("Elements of the queue are : ");
        System.out.println(q);

        //element(), returns the head(first) of the queue
        System.out.println(q.element());

        //poll, removes and returns the head of the queue
        System.out.println(q.poll());
        System.out.println("Now the q is : "+q);

        //peek(), returns the first element of the queue
        System.out.println(q.peek());


        //offer, add element
        System.out.println(q.offer(500));
        System.out.println(q);

        //remove(), removes from first
        System.out.println(q.remove());



    }
}
