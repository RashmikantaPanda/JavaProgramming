package com.java.collections.queue;

import java.util.*;

class MyComparator implements Comparator<String>{
    @Override
    public int compare(String s1, String s2) {
        return s1.length()-s2.length();
    }

}

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>(25,new MyComparator());
        pq.add("Rashmikanta Panda");
        pq.add("Jyotibikash Pradhan");
        pq.add("Souarava Sadashiv Mohanty");
        pq.add("Mitesh Rout");
        pq.add("Jitesh Khillar");

        //display
        for (String s:pq){
            System.out.println(s);
        }
        System.out.println(".................");
        pq.add("Suryakanta");
        System.out.println(pq);
        System.out.println("...................");
        //it will add priority to the highest length string first(bcz of adding comparator)
        while(pq.size()!=0){
            System.out.println(pq.poll());
        }

        System.out.println("_______________________________");
        Queue<String>  queue=new LinkedList<String>();
        queue.add("Rashmikanta Panda");
        queue.add("Jyotibikash Pradhan");
        queue.add("Souarava Sadashiv Mohanty");
        queue.add("Mitesh Rout");
        queue.add("Jitesh Khillar");
        System.out.println(queue);

    }

}
