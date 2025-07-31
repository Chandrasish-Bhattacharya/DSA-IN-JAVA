
import java.util.Stack;

public class QueueUsing2Stacks{
    static class Q{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            if(s1.isEmpty()){
                s1.push(data);
                return;
            }
            else{
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
                s1.push(data);
                while(!s2.isEmpty()){
                    s1.push(s2.pop());
                }
            }   
        }
    public static int remove(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int removedData=s1.pop();
        return removedData;
    }
    }
    public static void main(String[] args) {
        Q q = new Q();
        q.add(10);
        q.add(20);
        q.add(30);
        while(!q.isEmpty()){
            System.out.println("Element at front is: " + q.s1.peek());
            System.out.println("Element removed is: " + q.remove());
        }
        
        // Testing empty queue
        System.out.println("Trying to remove from empty queue: " + q.remove());
    }
}