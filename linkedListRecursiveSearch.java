package LINKEDLIST;

public class linkedListRecursiveSearch {
    public static class Node {
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

    public void addNodeAtFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printingLinkedList() {
        if (head == null) {
            System.out.print("Linked List is EMPTY!!");
            return;
        }
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("NULL");
    }

    public static int helperFunction(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int index = helperFunction(head.next, key);
        if (index == -1) {
            return -1;
        }
        return index + 1;
    }

    public static int recursiveSearch(int key) {
        return helperFunction(head, key);
    }

    public static void main(String args[]) {
        linkedListRecursiveSearch ll = new linkedListRecursiveSearch();
        ll.addNodeAtFirst(1);
        ll.addNodeAtFirst(2);
        ll.addNodeAtFirst(3);
        ll.addNodeAtFirst(4);
        ll.addNodeAtFirst(5);
        ll.printingLinkedList();
        System.out.print(linkedListRecursiveSearch.recursiveSearch(5));
    }
}
