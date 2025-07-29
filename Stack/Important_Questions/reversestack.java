
import java.util.Stack;

public class reversestack{
    public static Stack reversestack(Stack<Integer> s){ // my approch 
    Stack<Integer> s1 = new Stack<>();
    while(!s.isEmpty()){
        s1.push(s.pop());
    }
    return s1;
}
// youtube approch 
public static void pushatstart(int data , Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top_data = s.get(s.size() -1);
        s.pop();
        pushatstart(data, s);
        s.push(top_data);

    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top_data = s.pop();
        reverse(s);
        pushatstart(top_data, s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // Stack s1;
        
        // s1 = reversestack(s);
        // while(!s1.isEmpty()){
        //     System.out.print(s1.peek() + " ");
        //     s1.pop();

        // }
        reverse(s);
        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}