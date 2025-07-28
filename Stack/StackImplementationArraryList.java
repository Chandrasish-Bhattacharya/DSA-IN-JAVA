// StackImplementationArraryList.java
import java.util.ArrayList;

public class StackImplementationArraryList{
    static class stack{
        static ArrayList<Integer> stacklist = new ArrayList<>();
        public static boolean isEmpty(){
            return (stacklist.size() == 0);
        }
        public static void push(int data){
            stacklist.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1; // or throw an exception
            }
            int topdata = stacklist.get(stacklist.size() - 1);
            stacklist.remove(stacklist.size() - 1); // remove the last element
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