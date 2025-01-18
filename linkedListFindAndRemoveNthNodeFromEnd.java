package LINKEDLIST;

public class linkedListFindAndRemoveNthNodeFromEnd {
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

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void display() {
        if (head == null) {
            System.out.print("Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void removeNthFromEnd(int index){
        int sizeLL = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sizeLL++;
        }
        System.out.println(sizeLL);
        if(index == sizeLL){
            head = head.next;
            return;
        }
        int i = 1;
        int indexToFind = sizeLL - index;
        Node previousNode = head;
        while(i < indexToFind){
            previousNode = previousNode.next;
            i++;
        }
        previousNode.next = previousNode.next.next;
    }
    public static void main(String args[]) {
        linkedListFindAndRemoveNthNodeFromEnd.addFirst(2);
        linkedListFindAndRemoveNthNodeFromEnd.addFirst(1);
        linkedListFindAndRemoveNthNodeFromEnd.addLast(3);
        linkedListFindAndRemoveNthNodeFromEnd.addLast(4);
        linkedListFindAndRemoveNthNodeFromEnd.addLast(5);
        linkedListFindAndRemoveNthNodeFromEnd.display();
        linkedListFindAndRemoveNthNodeFromEnd.removeNthFromEnd(3);
        linkedListFindAndRemoveNthNodeFromEnd.display();
    }
}
