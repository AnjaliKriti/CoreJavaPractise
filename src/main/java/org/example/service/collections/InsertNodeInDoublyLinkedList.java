package org.example.service.collections;

public class InsertNodeInDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insert nodes into the doubly linked list
        dll.insertAtEnd(1);
        dll.insertAtEnd(2);
        dll.insertAtEnd(3);

        System.out.println("Doubly Linked List: ");
        dll.display();
    }
}
class Node {
    int data;
    Node prev, next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    // Method to insert a new node at the end of the doubly linked list
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node as the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        // Set the previous and next pointers of the new node
        last.next = newNode;
        newNode.prev = last;
    }

    // Method to display the doubly linked list
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

