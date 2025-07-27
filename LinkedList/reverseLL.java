

public class reverseLL{
    Node head; // head of the linked list
    class Node{
        int data; 
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void add(int data){
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
    public void reverseIterate(){
        if(head == null || head.next == null) return;
        Node prev = head;
        Node currNode = head.next;
        
        while(currNode!= null){
            Node nextNode = currNode.next;
            currNode.next = prev; // link change taking place 

            prev = currNode; // value update for the pointers 
            currNode = nextNode;
        }
        head.next = null;
        head = prev;
    }
    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){ 
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

    }
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
    public static void main(String[] args){
        reverseLL list = new reverseLL();
        list.add(6);
        list.add(3);
        list.add(1);
        list.printLL();
        System.out.println("");
        list.reverseIterate();
        list.printLL();
        System.out.println("");
        list.head = list.reverseRecursive(list.head);
        list.printLL();

    }
}