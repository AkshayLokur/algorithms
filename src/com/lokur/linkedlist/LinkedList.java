package com.lokur.com.lokur.linkedlist;

public class LinkedList {

    Node head;

    LinkedList(Node head) {
        this.head = head;
    }


    void printList() {
        Node n = head;
        while (n != null && n.getNext() != null) {
            System.out.print(n.getData() + " -> ");
            n = n.getNext();
        }

        System.out.println(n.getData());
    }

}
