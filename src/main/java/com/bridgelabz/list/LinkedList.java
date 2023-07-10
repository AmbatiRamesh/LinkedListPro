package com.bridgelabz.list;

public class LinkedList {
    public class Node {
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
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void searchNode(int data) {
        Node current = head;
        int i = 1;
        boolean flag = false;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            while(current != null) {
                if(current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if(flag)
            System.out.println("Element is present in the list at the position : " + i);
        else
            System.out.println("Element is not present in the list");
    }
    public void addNodeAtPosition(int data, int position) {
        Node newNode = new Node(data);
        newNode.next = null;
        if(position < 1) {
            System.out.print("\nposition should be >= 1.");
        } else if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node  current = new Node(data);
            current = head;
            for(int i = 1; i < position-1; i++) {
                if(current != null) {
                    current = current.next;
                }
            }
            if(current != null) {
                newNode.next = current.next;
                current.next = newNode;
            } else {
                System.out.print("\nThe previous node is null.");
            }
        }
    }
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            if (current.next != null)
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
        link.addNode(70);
        link.display();
        link.searchNode(40);
        link.display();
        link.addNodeAtPosition(40,3);
        link.display();
    }
}
