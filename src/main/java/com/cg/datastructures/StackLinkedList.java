package com.cg.datastructures;


public class StackLinkedList {

    public static void main(String[] args) {
        LinkedList.Node head = new LinkedList.Node(70);

        head = push(head, 30);
        displayList(head);
        head = push(head, 56);
        displayList(head);
        peakAndPop(head);
    }

    public static LinkedList.Node push(LinkedList.Node head, int data) {
        return LinkedList.adding(head, data);
    }

    public static void displayList(LinkedList.Node head) {
        LinkedList.Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println(current);

    }

    public static void peakAndPop(LinkedList.Node head) {
        LinkedList.Node current = head;
        while (current != null) {
            System.out.println("Head is at:" + current.data);
            LinkedList.Node temp = current;
            current = current.next;
            displayList(current);
        }
    }


}
