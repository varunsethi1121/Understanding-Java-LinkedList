package LINKEDLIST;

public class linkedListReversal {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addAtLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void displayLL(){
        if(head == null){
            System.out.print("Empty LL");
        }
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("NULL");
    }

    public void linkedListReversal(){
        Node previousNode = null;
        Node currentNode = head;
        Node nextNode;
        while(currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        head = previousNode;
    }
    public static void main(String args[]){
        linkedListReversal ll = new linkedListReversal();
        ll.addAtLast(1);
        ll.addAtLast(2);
        ll.addAtLast(3);
        ll.addAtLast(4);
        ll.addAtLast(5);
        ll.displayLL();
        ll.linkedListReversal();
        ll.displayLL();

    }
}
