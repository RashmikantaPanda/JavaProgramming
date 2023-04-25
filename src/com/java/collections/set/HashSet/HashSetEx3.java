//Adding books to set and
package com.java.collections.set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

class Book{
    int id;
    String name;
    String author;
    float price;
    Book(int id,String name,String author,float price){
        this.id=id;
        this.name=name;
        this.author=author;
        this.price=price;
    }

}

public class HashSetEx3 {
    public static void main(String[] args) {
        Book b1=new Book(100,"Mathematics","R.D. Sharma", 780.00F);
        Book b2=new Book(101,"Chemistry","N. Kristnamurty", 1140.50F);
        Book b3=new Book(400,"Information Technology","E Balagurusami", 460.00F);
        HashSet<Book> bookHashSet=new HashSet<>();
        bookHashSet.add(b1);
        bookHashSet.add(b2);
        bookHashSet.add(b3);
        bookHashSet.add(new Book(100,"AB","CD",122));

        Iterator<Book> itr=bookHashSet.iterator();
        for(Book b:bookHashSet){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.price);
        }
    }

}
