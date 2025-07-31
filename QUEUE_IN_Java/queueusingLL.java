public class queueusingLL{
    class Node{
        int data;
        Node Next;
        Node(int data){
            this.data = data;
            this.Next = null;
        }
    }
    static Node head = null;
    static Node rear = null;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            rear = newNode;
            return;
        }
        rear.Next = newNode;
        rear = newNode;
    }
    public int remove(){
        int topdata = head.data;
        if(head == null) return -1;
        if(head == rear){
            head = null;
            rear = null; 
            return topdata;
        }
        head = head.Next;
        return topdata;
    }
    public int peek(){
        if(head == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }
    public static void main(String args[]){
        queueusingLL q = new queueusingLL();
        q.add(10);
        q.add(20);
        q.add(30);
        while(q.peek() != -1){
            System.out.println("Element at front is: " + q.peek());
            System.out.println("Element removed is : " + q.remove());
        }
    }
}