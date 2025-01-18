package LINKEDLIST;

public class linkedListBasics {
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

    public void addNodeAtLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            tail = head = newNode;
            return;
        }
        // newNode.next = null; ALREADY DECLARED NEWNODE NEXT TO NULL IN LINE 10
        tail.next = newNode;
        tail = newNode;
    }

    public void addAtIndex(int index, int data) {
        if (index == 0) {
            addNodeAtFirst(30);
        }
        Node newNode = new Node(data);
        size++;
        // THIS BASE CONDITION WILL NOT GIVE THE PERFECT OUTPUT BEACUSE IF WE WANT TO
        // ADD AT INDEX 0 MEANS WE WANT TO ADD AT FIRST SO WE NEED TO CALL ADD FIRST
        // FUNCTION
        // if (head == null) {
        // head = tail = newNode;
        // return;
        // }
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFromFirst() {
        int val = head.data;
        head = head.next;
        return val;
    }

    public int removeFromLast() {

        if (size == 0) {
            System.out.print("Empty Linked List");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail=prev;
        size--;
        return val;
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

    public static void main(String args[]) {
        linkedListBasics ll = new linkedListBasics();
        ll.printingLinkedList();
        ll.addNodeAtFirst(1);
        ll.printingLinkedList();
        ll.addNodeAtFirst(2);
        ll.printingLinkedList();
        ll.addNodeAtFirst(3);
        ll.printingLinkedList();
        ll.addNodeAtLast(4);
        ll.printingLinkedList();
        ll.addNodeAtLast(5);
        ll.printingLinkedList();
        ll.addNodeAtLast(6);
        ll.printingLinkedList();
        ll.addAtIndex(5, 10);
        ll.printingLinkedList();
        ll.addAtIndex(2, 20);
        ll.printingLinkedList();
        ll.addAtIndex(0, 30);
        ll.printingLinkedList();
        System.out.print(linkedListBasics.size);
        System.out.println("");
        System.out.println(ll.removeFromFirst());
        ll.printingLinkedList();
        System.out.println(ll.removeFromLast());
        ll.printingLinkedList();
    }
}
