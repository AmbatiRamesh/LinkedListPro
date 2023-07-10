package com.bridgelabz.list;

public class LinkedList {
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.addNode(56);
        link.addNode(30);
        link.addNode(76);
    }
}
