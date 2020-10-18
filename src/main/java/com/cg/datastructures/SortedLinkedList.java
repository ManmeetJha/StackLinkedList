package com.cg.datastructures;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortedLinkedList {

    Node head;

    public static class Node {
        int data;
        Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = sortedAdding(null, 56);
        displayList(head);
        head = sortedAdding(head, 30);
        displayList(head);
        head = sortedAdding(head, 40);
        displayList(head);
        head = sortedAdding(head, 70);
        displayList(head);
    }

    public static void displayList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println(current);

    }

    public static Node sortedAdding(Node head, int data) {
        //Created new node
        Node newNode = new Node(data);

        //If head is null
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            Node previous = null;
            while (current != null && current.data < data) {
                previous = current;
                current = current.next;
            }
            if (previous != null) {
                previous.next = newNode;
                newNode.next = current;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }
        return head;
    }
}
