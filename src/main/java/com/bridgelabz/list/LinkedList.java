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

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else if (head.next == null) {
            head.next = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteFromStart() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            if (head != tail) {
                head = head.next;
            } else {
                head = tail = null;
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
            if(current.next != null)
                System.out.print(current.data + "->");
            else
                System.out.println(current.data + "\n");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.append(56);
        link.display();
        link.append(30);
        link.display();
        link.append(70);
        link.display();
        link.deleteFromStart();
        link.display();
    }
}
