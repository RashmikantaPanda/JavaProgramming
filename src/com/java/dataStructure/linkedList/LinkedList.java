package com.java.basics.dataStructure.linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node first = null;
    public Node last = null;


    public void addNodeAtEnd(int data) {  //insert at end
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }

    }

    public void addNodeAtBegining(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

    public void InsertAtAny(int pos, int data) {
        Node newNode = new Node(data);
        Node curr;
        Node prev = null;
        curr = first;
        int key = 1;
        while (curr != null && key != pos) {

            prev = curr;
            if (key != pos) {
                key++;
            }
            curr = curr.next;
            if (curr == null) {
                System.out.println("Key not found ! Insertion Not Possible!!!");
            }
            // curr=curr.next;
        }
        prev.next = newNode;
        newNode.next = curr;

    }

    public void display() {
        Node current = first;
        if (first == null) {
            System.out.println("List is Empty");
        } else {
            System.out.println("Nodes of the linkedList are : ");
            while (current != null) {
                System.out.print(current.data + "\t");
                current = current.next;
            }
            System.out.println("\n");
        }
    }

    public void deleteEnd() {
        if (first == null) {
            System.out.println("List is Empty ! Deletion is not Possible!!!");
        } else {
            Node temp = first;
            while (temp.next != last) {
                temp = temp.next;
            }
            System.out.println(last.data + " is deleted.");
            temp.next = null;
            last = temp;
        }
    }

    public void deleteFrist() {
        if (first == null) {
            System.out.println("List is Empty ! Deletion is not Possible!!!");
        } else {
            System.out.println(first.data + " is deleted.");
            first = first.next;
        }
    }

    void deleteByIndex(int index) {
        if (first == null) {
            System.out.println("List is empty. Deletion not possible");
        } else {
            Node prev = null, curr = first;
            int key = 1;
            while (curr != null && key != index) {
                prev = curr;
                curr = curr.next;
                key++;
            }
            if (curr == null) {
                System.out.println("Index not found, Deletion not possible.!");
            } else {
                System.out.println(curr.data + " is deleted.");
                prev.next = curr.next;
                curr = null;
            }

        }
    }

    public boolean checkLoop() {

        Node ptr1 = first;
        Node ptr2 = first;

        while (ptr1 != null && ptr1.next != null) {
            ptr1 = ptr1.next.next;
            ptr2 = ptr2.next;
            if (ptr1 == ptr2) {
                return true;
            }
        }

        return false;
    }

    public void sortList() {

        Node current = first, index = null;
        int temp;
        if (first == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
            System.out.println("List is Sorted");
        }
    }

    public void SplitLinkedList(int locVal) throws IOException {
        Node prev = null;
        Node curr = first;
        Node head1 = first;
        Node head2 = null;
        int key = 0;
        while (curr != null && key != locVal) {
            prev = curr;
            curr = curr.next;
            key++;
        }
        if (curr == null) {
            System.out.println("Key not found !");
        }
        if (key == locVal) {
            head2 = curr;
            prev.next = null;
            //first = prev;

        }
        //display();
        Node ptr1 = head1;
        Node ptr2 = head2;
        System.out.println("First List :");
        while (ptr1 != null) {
            System.out.print(">> " + ptr1.data);
            ptr1 = ptr1.next;
        }
        System.out.println();
        System.out.println("Second List : ");
        while (ptr2 != null) {
            System.out.print(">>" + ptr2.data);
            ptr2 = ptr2.next;

        }
    }

    public void MergeList() {

    }

    void reverse() {
        Node prev = null;
        Node current = first;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        first = prev;
        System.out.println("LinkedList is Reversed");
    }

    void removeNthFromEnd( int n) {
        Node fast = first, slow = first;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            first=first.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        System.out.println("Deleted");
    }

    public static void main(String[] args) throws IOException {
        LinkedList list1 = new LinkedList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = 0;
        int input;
        while (value != 20) {
            System.out.println("\n1.InsertAtFirst \n2.InsertAtEnd \n3.InsertAtAnyPosition \n4.DeleteFromFirst \n5.DeleteFromEnd" +
                    "\n6. DeleteFromIndex \n7. CheckLoop \n8.SortList \n9.Split List \n11.ReverseList \n12.DeleteNthNodeFromLast \n19.Display \n20.Exit");
            System.out.println("Enter your choice : ");
            value = Integer.parseInt(br.readLine());

            switch (value) {
                case 1:
                    System.out.println("Enter the data value of the node to be insert : ");
                    input = Integer.parseInt(br.readLine());
                    list1.addNodeAtBegining(input);
                    break;
                case 2:
                    System.out.println("Enter the data value of the node to be insert : ");
                    input = Integer.parseInt(br.readLine());
                    list1.addNodeAtEnd(input);
                    break;

                case 3:
                    System.out.println("Enter the pos &  data value : ");
                    int key1 = Integer.parseInt(br.readLine());
                    input = Integer.parseInt(br.readLine());
                    list1.InsertAtAny(key1, input);
                    break;
                case 4:
                    list1.deleteFrist();
                    break;
                case 5:
                    list1.deleteEnd();
                    break;
                case 6:
                    System.out.println("Enter the index you want to delete : ");
                    int index = Integer.parseInt(br.readLine());
                    list1.deleteByIndex(index);
                    break;
                case 7:
                    boolean b = list1.checkLoop();
                    if (b)
                        System.out.println("Loop Present");
                    else
                        System.out.println("No Loop");
                    break;
                case 8:
                    list1.sortList();
                    break;
                case 9:
                    System.out.println("Enter the index where you want to split : ");
                    int loc = Integer.parseInt(br.readLine());
                    list1.SplitLinkedList(loc);
                    break;
                case 11:
                    list1.reverse();
                    break;
                case 12:
                    System.out.println("Enter the index that you want to delete from last  : ");
                    int delEnd=Integer.parseInt(br.readLine());
                    list1.removeNthFromEnd(delEnd);
                    break;


                case 19:
                    list1.display();
                    break;

                case 20:
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;


            }

        }
    }

}
