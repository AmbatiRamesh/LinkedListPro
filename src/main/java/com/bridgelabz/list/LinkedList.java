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
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            if(current.next != null)
                System.out.print(current.data + "->");
            else
                System.out.println(current.data + "\n");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.addNode(56);
        link.display();
        link.addNode(30);
        link.display();
        link.addNode(76);
        link.display();
    }
}
