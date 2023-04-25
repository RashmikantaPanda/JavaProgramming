package com.java.collections.list.stack;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();

        //isEmpty()
        System.out.println(stack.isEmpty());

        //push elemets to the stack, push()
        stack.push(100);
        stack.push(200);
        stack.push(150);
        stack.push(160);
        stack.push(120);
        stack.push(120);


        System.out.println(stack);


        //remove elemet from stack. pop()
        System.out.println(stack.pop());

        //peek()
        System.out.println("Top of the stack : "+stack.peek());

        //search(Object o)
        System.out.println("100 is present at : ");
        System.out.println(stack.search(100));

        //size()
        System.out.println("Size of the stack is : "+stack.size());

        //iterator()
        System.out.println("Stack elements are : ");
        Iterator<Integer> itr=stack.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();

        stack.forEach(i->{
            System.out.println(i);
                });







    }


}
