package com.lokur.linkedlist;

public class DuplicatesRemoval {

    public static void main(String[] args) {

        Node n7 = new Node(6, null);
        Node n6 = new Node(6, n7);
        Node n5 = new Node(3, n6);
        Node n4 = new Node(3, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(2, n2);

        LinkedList list = new LinkedList(n1);

        list.printList();

        list = removeDuplicates(list);

        System.out.println("\nAfter duplicates removal: ");
        list.printList();
    }

    private static LinkedList removeDuplicates(LinkedList list) {
        Node p1 = list.head;
        while (p1 != null && p1.getNext() != null) {
            Node p2 = p1;
            while (p2 != null && p2.getNext() != null) {
                while (p2.getNext() != null && p1.getData() == p2.getNext().getData()) {
                    // Found duplicate node - delete it (node p2)
                    p2.setNext(p2.getNext().getNext());
                }
                p2 = p2.getNext();
            }
            p1 = p1.getNext();
        }

        return list;
    }


}
