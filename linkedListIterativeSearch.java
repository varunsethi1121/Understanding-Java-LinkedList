package LINKEDLIST;

public class linkedListIterativeSearch {
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

    public int iterativeSearch(int key){
        Node tempNode = head;
        int i = 0;
        while(tempNode != null){
            if(tempNode.data == key){
                return i;
            }
            tempNode = tempNode.next;
            i++;
        }
        return i;
    }
    public static void main(String args[]){
        linkedListIterativeSearch ll = new linkedListIterativeSearch();
        ll.addAtLast(1);
        ll.addAtLast(2);
        ll.addAtLast(3);
        ll.addAtLast(4);
        ll.addAtLast(5);
        ll.displayLL();
        System.out.print(ll.iterativeSearch(1));


    }

    public void linkedListReversal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'linkedListReversal'");
    }
}
