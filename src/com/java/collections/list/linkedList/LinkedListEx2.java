package com.java.collections.list.linkedList;

import java.util.LinkedList;
import java.util.List;

class Book{
    int id,quantity;
    String name,author,publisher;

    public Book(int id, int quantity, String name, String author, String publisher) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }
}
public class LinkedListEx2 {
    public static void main(String[] args) {
        List<Book> list=new LinkedList<Book>();
        Book b1=new Book(100,5,"DSA","Debasis Samanta","Mc Graw Hill");
        Book b2=new Book(101,15,"DBMS","Rashmikanta","Mc Graw Hill");
        Book b3=new Book(102,3,"Networking","JyotiBikash","Kalyani Publisher");
        Book b4=new Book(103,6,"CSA","Sourabha","University Press");

        //add to the list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);

        for(Book b:list){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
