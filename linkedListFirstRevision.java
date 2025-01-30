package LINKEDLIST;

public class linkedListFirstRevision {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size; 

    public void addNodeAtFirstPlace(int data) { 
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addNodeAtLastPlace(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addNodeAtGivenIndex(int data, int index) {
        if (index == 0) {
            addNodeAtFirstPlace(data);
        }
        Node newNode = new Node(data);
        size++;
        Node tempNode = head;
        int i = 0;
        while (i < index - 1) {
            tempNode = tempNode.next;
            i++;
        }
        newNode.next = tempNode.next;
        tempNode.next = newNode;
    }

    public int removeNodeFromFirst() {
        int valueReturn = head.data;
        head.next = null;
        return valueReturn;
    }

    public int removeNodeFromLast() {
        if (size == 0) {
            System.out.println("Empty Linked List!!");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int valueReturn = head.data;
            head = tail = null;
            size = 0;
            return valueReturn;
        }
        Node prevNode = head;
        for (int i = 0; i < size - 2 && prevNode != null; i++) {
            prevNode = prevNode.next;
        }
        int valueReturn = prevNode.next.data;
        prevNode.next = null;
        tail = prevNode;
        size--;
    
        return valueReturn;
    }
    

    public void printingOfEnteredLinkedList() {
        if (head == null) {
            System.out.print("Entered Linked List is Empty");
            return;
        }
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        System.out.print("NULL");
    }

    public static void main(String args[]) {
        linkedListFirstRevision ll = new linkedListFirstRevision();
        ll.addNodeAtFirstPlace(10);
        ll.addNodeAtFirstPlace(20);
        ll.addNodeAtFirstPlace(30);
        ll.addNodeAtFirstPlace(40);
        ll.addNodeAtFirstPlace(50);
        ll.addNodeAtLastPlace(10);
        ll.addNodeAtLastPlace(20);
        ll.addNodeAtLastPlace(30);
        ll.addNodeAtLastPlace(40);
        ll.addNodeAtLastPlace(50);
        ll.addNodeAtGivenIndex(0, 5);
        ll.printingOfEnteredLinkedList();
        System.out.println();
        System.out.println(ll.removeNodeFromFirst());
        System.out.println(ll.removeNodeFromLast());
    }
}
