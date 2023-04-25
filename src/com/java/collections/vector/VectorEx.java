package com.java.collections.vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<String> vec=new Vector<String>(4,6);
        //add elements, add(), addElement()
        vec.add("Mango");
        vec.add("Orange");
        vec.addElement("Grapes");
        vec.addElement("Orange");
        System.out.println(vec);

        //capacity()
        System.out.println("Capacity "+vec.capacity());
        System.out.println("Size of vec " +vec.size());

        //contains(Obj o)
        System.out.println("Contains \"Orange\" : "+vec.contains("Orange"));

        //containsAll()
        ArrayList<String> li=new ArrayList<String>();
        li.add("Fruit1");
        li.add("Fruit2");
        li.add("Fruit3");

        vec.addAll(li);
        System.out.println("After adding a list to this vector ");
        System.out.println(vec);

        //elementAt()
        System.out.println("Element at index 5 : "+vec.elementAt(5));

        //fristEmement(), lastElement()
        System.out.println("First Element " +vec.firstElement());
        System.out.println("Last Element " +vec.lastElement());

        //setElement(Obj o, int index)
        vec.setElementAt("Mango",0);
        System.out.println("After adding \"Mango\" at index 0 : "+vec);

        //sort()
        Collections.sort(vec);
        System.out.println(vec);

        //removeAll()
        vec.removeAll(li);
        System.out.println("After removing the list \"li\" from the vec : "+vec);
        vec.removeAll(vec);
        System.out.println("After removing the Vector \"vec\" from the vec : "+vec);

    }
}
