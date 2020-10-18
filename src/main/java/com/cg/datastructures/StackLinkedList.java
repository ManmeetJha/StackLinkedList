package com.cg.datastructures;

public class StackLinkedList {

    public static void main(String[] args) {
        LinkedList.Node head = new LinkedList.Node(70);

        displayList(push(head, 30));
        displayList(push(push(head, 30), 56));
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


}
