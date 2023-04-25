package com.java.collections.list.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LInkedListExample {
    public static void main(String[] args) {
        //Create LinkedList
        LinkedList <String> list=new LinkedList<String>();

        //add element to the list
        list.add("Rashmi");
        list.add("Jyoti");
        list.add("Sourav");
        list.add("Jitesh");
        list.add("Mitesh");
        System.out.println(list);

        //adding at specific index
        list.add(2,"Surya");
        System.out.println(list);

        //Create another linkedList
        LinkedList <String> list1=new LinkedList<String>();
        list1.add("Umakanta");
        list1.add("Priyaranjan");
        list1.add("Sumanta");
        list1.add("Rahul");



        //addAll(Collection c)
        list.addAll(list1);
        System.out.println(list);
        System.out.println("----------------------");


        //addFirst()
        list.addFirst("Subham");
        //addLast()
        list.addLast("Sukumar");
        System.out.println(list);
        System.out.println("----------------------");


        //clone()
        LinkedList linkedList;
//        Object o=list.clone();
        linkedList=(LinkedList) list.clone();
        System.out.println(linkedList);
        System.out.println("----------------------");


        //contains()
        System.out.println(list.contains("Rashmi"));
        System.out.println(list.contains("Dinesh"));
        System.out.println("----------------------");


        //Iterator descendingIterator()
        Iterator<String> iterator=list.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----------------------");


        //element()
        String str=list.element();
        System.out.println("Retrieve "+str);
        System.out.println("----------------------");


        //getFirst()  getLast()
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println("----------------------");


        //indexOf()
        System.out.println(list.indexOf("Rashmi"));
        System.out.println(list.indexOf("Subham"));
        System.out.println("----------------------");


        //listIterator()
        ListIterator<String> listIterator=list.listIterator(5);
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();
        System.out.println("----------------------");


        //offer(), offerLast(), offerFirst()
        list.offer("Sarmila");
        list.offerLast("Niru");
        list.offerFirst("Kusum");
        System.out.println(list);
        System.out.println("----------------------");


        //peek(), peekFirst(), peekLast()
        String s=list.peek();
        System.out.println(s);
        System.out.println(list.peekLast());
        //System.out.println(list);
        System.out.println("----------------------");


        //poll(), pollFirst(), pollLast()
        System.out.println(list.poll());
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println("----------------------");


        //remove(), remove(int index), remove(Object o), removeLast()
        System.out.println(list);
        System.out.println(list.remove());
        System.out.println(list.remove(0));
        System.out.println(list.remove("Jyoti"));
        System.out.println(list.removeLast());
        System.out.println(list);
        System.out.println("----------------------");


        //set(int index, E element)
        System.out.println(list.set(0,"Rashmi"));
        System.out.println("----------------------");


        //toArray()
        Object[] objArr= list.toArray();
        for(Object o:objArr){
            System.out.println(o);
        }
        System.out.println("----------------------");

        //size()
        System.out.println(list.size());
        System.out.println("----------------------");

        //clear()
        list.clear();
        System.out.println(list);

    }
}
