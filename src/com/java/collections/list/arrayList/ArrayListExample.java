package com.java.collections.list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {

        //creating an integer arrayList
        ArrayList<Integer> li=new ArrayList<Integer>();
        //adding elements
        li.add(100);
        li.add(82);
        li.add(35);
        li.add(55);
        li.add(66);
        li.add(55);
        System.out.println(li);
        // adding elements using indexing
        li.add(1,102);
        System.out.println(li);

        //creating another list
        ArrayList<Integer> li2= new ArrayList<Integer>();
        li2.add(200); li2.add(300); li2.add(400); li2.add(100);

        //addAll(), adding li2 to li
        li.addAll(li2);
        System.out.println(li);

        //addAll(i,e), now adding li2 at specific index of li
        li.addAll(2,li2);
        System.out.println(li);

        //clear(), clearing the list li2
        //li2.clear();
        //System.out.println(li2);

        //ensureCapacity(int a)
        li.ensureCapacity(100);

        //get(int index)
        System.out.println(li.get(0));
        System.out.println(li.get(li.size()-1));

        //isEmpty()
        System.out.println("Li: "+li.isEmpty());
        System.out.println("Li2: "+li2.isEmpty());

        //Iterator()
        Iterator<Integer> itr=li.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        //lastIndexOf(Obj o)
        System.out.println("\n"+li.lastIndexOf(100));
        System.out.println("\n"+li.lastIndexOf(5000));  //return -1

        //toArray()
        Object[] a=li.toArray();
        System.out.println(a);
        System.out.println(a.length);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        //clone()
        Object b=li.clone();
        System.out.println(b);

        //containts(Object o)
        System.out.println(li.contains(200));
        System.out.println(li.contains(99));

        //indexOf(Object o)
        System.out.println(li.indexOf(200));

        //remove(int index)
        //remove(Object o)
        //removeAll()
        System.out.println(li.remove(0));
        //System.out.println(li.remove(200));
        System.out.println(li.addAll(li2));//adding li2
        System.out.println(li.removeAll(li2));



    }

}



