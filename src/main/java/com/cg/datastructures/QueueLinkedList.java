package com.cg.datastructures;

public class QueueLinkedList {
    public static LinkedList.Node head;
    public static void main(String[] args) {
        enqueue(56);
        LinkedList.displayList(head);
        enqueue(30);
        LinkedList.displayList(head);
        enqueue(70);
        LinkedList.displayList(head);

    }

    public static void enqueue(int data){
        if(head==null){
            head = new LinkedList.Node(data);
        }else {
            LinkedList.append(head, data);
        }
    }
}
