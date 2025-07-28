
import java.util.Stack;

public class StackImplementationCollections{
    public static void main(String args[]){
        Stack<Integer> st1 = new Stack<>();
        st1.push(9);
        st1.push(8);
        st1.push(7);
        st1.push(6);
        st1.push(5);
        st1.push(4);
        st1.push(3);
        st1.push(2);
        st1.push(1);
        while(!st1.isEmpty()){
            System.out.print(st1.peek() + " ");
            st1.pop();
        }

    }
}