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

    public void addNodeAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addNodeAtLast(int data) {
        Node newNode = new Node(data);
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
    }
}
