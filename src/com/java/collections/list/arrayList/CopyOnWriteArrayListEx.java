package com.java.collections.list.arrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>(new Integer[]{1000,2000,4000});
        list.add(120);
        list.add(363);
        list.add(420);
        list.add(459);
        list.add(550);
        list.add(457);

//      System.out.println(list);
        Iterator<Integer> itr1=list.iterator();
        list.add(2); //it will not add to the iterator (itr1)
        list.add(3); //it will not add to the iterator (itr1)
        list.add(5); //it will not add to the iterator (itr1)
        while(itr1.hasNext()){
            Integer i= (Integer) itr1.next();
            if(i%2==0)
                list.remove(i); //Removing While Iterating Is Not Allowed
            System.out.println(itr1.next());
        }
        //We can create another iterator to print the elements that are added after first iterator
        System.out.println("--------Second Iteration-------------");
        Iterator<Integer> itr2=list.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        //System.out.println(list);


        //it can't perform remove operation while iterating
        //UnsupportedOperation exception will occur
    }
}
