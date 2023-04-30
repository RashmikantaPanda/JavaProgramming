//Sort a hashMap by its value (Userdefiend type)
package com.java.collections.map.HashMap;

import java.util.*;

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

}
public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap<Integer, Book> hashMap=new HashMap<>();
        Book b1=new Book(100,"DAA","BNB Ray","Mc Graw Hil",125);
        Book b2=new Book(108,"C Programming","E Balagurusamy","University Press",300);
        Book b3=new Book(105,"Networking","Haraprasad Nayak","Mc Graw Hil",50);
        Book b4=new Book(105,"Networking","Haraprasad Nayak","Mc Graw Hil",50);
        hashMap.put(3,b1);
        hashMap.put(5,b4);
        hashMap.put(1,b2);
        hashMap.put(2,b3);

//        System.out.println(hashMap);

        for (Map.Entry<Integer,Book> entry:hashMap.entrySet()){
            int key=entry.getKey();
            Book b=entry.getValue();
            System.out.println(key+" "+b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

        //Sort by values
//        Map<Integer, Book> map=sortByValue(hashMap);

//        Set<Map.Entry<Integer,Book>> entrySet=hashMap.entrySet();
        List<Map.Entry<Integer,Book>> list=new ArrayList<>(hashMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Book>>() {
            @Override
            public int compare(Map.Entry<Integer, Book> o1, Map.Entry<Integer, Book> o2) {
                return o1.getValue().getName().compareTo(o2.getValue().getName());
            }
        });
       /* for(Map.Entry entry: map.entrySet()){
            //System.out.println(entry.getKey()+" "+entry.getValue());
        }*/
        list.forEach(e->{
            System.out.println(e.getKey()+" "+e.getValue().getId()+" "+e.getValue().getName()+" "+e.getValue().getAuthor()+" "+e.getValue().getQuantity());
        });


    }
    /*static HashMap sortByValue(HashMap map){
        List list=new LinkedList(map.entrySet());
        Collections.sort(list, new IdComparator());

        //Copy to listHashMap for preserve the insertion order
        HashMap sortedHashMap= new LinkedHashMap();
        Iterator itr=list.iterator();
        while (itr.hasNext()){
            Map.Entry entry= (Map.Entry) itr.next();
            sortedHashMap.put(entry.getKey(),entry.getValue());
        }
        return sortedHashMap;
    }

    static class IdComparator implements Comparator<Book>{

        @Override
        public int compare(Book o1, Book o2) {
            if(o1.id>o2.id)
                return 1;
            else if (o1.id==o2.id) {
                return -1;
            }
            else
                return 0;
        }
    }
*/
}
