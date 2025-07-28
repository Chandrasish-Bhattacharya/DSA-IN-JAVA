public class stackImplementationusingLL {
	// lets create a node class 
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    static class stack{
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            else{
                newNode.next = head;
                head = newNode;
            }
        }
        // now lets pop the element from the stack
        // this will return the top element of the stack
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1; // or throw an exception
            }
            int topdata = head.data;
            head = head.next; // move head to the next node
            return topdata;
        }
    }
    public static void main(String[] args){
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Popped element: " + s.pop()); // should print 30
        
    }
}