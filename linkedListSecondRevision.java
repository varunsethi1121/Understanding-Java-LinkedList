package LINKEDLIST;

public class linkedListSecondRevision {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int sizeOfLinkedList;

    public void addAtStart(int data){
        Node newNode = new Node(data);
        sizeOfLinkedList++;
        if(head==null){
            head=tail=newNode;
            return;
        }newNode.next=head;
        head=newNode;
    }
    public void displayLinkedList(){
        if(head==null){
            System.out.print("Empty Linked List Found!!!");
            return;
        }Node currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.data + " -> ");
            currentNode=currentNode.next;
        }
        System.out.print("NULL");
    }
    public int iterativeSearch(int targetVariable){
        if(head==null){
            System.out.print("Empty Linked List Found!!");
            return -1;
        }Node currentNode = head;
        int currentIndex=0;
        while(currentNode!=null){
            if(currentNode.data==targetVariable){
                return currentIndex;
            }currentNode=currentNode.next;
            currentIndex++;
        }
        return -1;
    }
    public int healperFunction(Node head,int targetVariable){
        if(head==null){
            return -1;
        }if(head.data==targetVariable){
            return 0;
        }int indexReturn = healperFunction(head.next, targetVariable);
        if(indexReturn==-1){
            return -1;
        }return indexReturn+1;
    }
    public int recursiveSearch(int targetVariable){
        return healperFunction(head,targetVariable);
    }
    public static void main(String args[]){
        linkedListSecondRevision llsr = new linkedListSecondRevision();
        llsr.addAtStart(10);
        llsr.addAtStart(20);
        llsr.addAtStart(30);
        llsr.addAtStart(40);
        llsr.addAtStart(50);
        llsr.displayLinkedList();
        System.out.println();
        System.out.println("Target variable found at index -> " + llsr.iterativeSearch(30));
        System.out.println("Target variable found at index -> " + llsr.iterativeSearch(0));
        System.out.println();
        System.out.println("Target variable found at index -> " + llsr.recursiveSearch(20));
        System.out.println("Target variable found at index -> " + llsr.recursiveSearch(0));
        }
}
