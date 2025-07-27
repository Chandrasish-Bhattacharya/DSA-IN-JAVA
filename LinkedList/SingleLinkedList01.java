public class SingleLinkedList01 {
    Node head; // head of the linked list
    class Node{
        int data; 
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // add operations for the linked list
    // 2 types of operations:
    // 1. Add a node at the start of the linked list
    // 2. Add a node at the end of the linked list
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        
            newNode.next = head;
            head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next =newNode;
    }

    // lets print the linked list 
    public void printLL(){
        if(head == null){ 
            System.out.print("The Linked List is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    // lets start the deletion of ll 
    public void delstart(){
        if(head == null){
            System.out.print("Sorry the linked List is empty!");
        }
        head = head.next;
    }

    public void delend(){
        if(head == null){
            System.out.print("Sorry the linked list is empty!");
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node currNode = head;
        Node nextpoint = head.next;
        while(nextpoint.next != null){
            currNode = currNode.next;
            nextpoint = nextpoint.next;
        }
        currNode.next = null;
    }

    public static void main(String[] args) {
        SingleLinkedList01 list = new SingleLinkedList01();
        list.addFirst(7);
        list.addFirst(8);
        list.addLast(80);
        list.printLL();
        System.out.println("");
        list.delstart();
        list.printLL();
        System.out.println("");
        list.delend();
        list.printLL();
    }
}