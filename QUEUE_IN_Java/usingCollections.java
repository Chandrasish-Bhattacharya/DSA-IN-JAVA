
import java.util.ArrayDeque;
import java.util.Queue;

public class usingCollections{
    public static void main(String[] args){
        //Queue<Integer> q = new LinkedList<>(); // as LinkedList implements Queue interface
        // 2nd way to create a queue
        Queue<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        while(q.peek() != -1){
            System.out.println("Element at front is: " + q.peek());
            q.remove();
        }
    }
}