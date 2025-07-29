
import java.util.Stack;

public class pushatstart{
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
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(9);
        s.push(8);
        s.push(7);
        s.push(6);
        s.push(5);
        s.push(4);
        
        pushatstart(0, s);
        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}