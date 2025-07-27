
import java.util.LinkedList;

public class collectionLL{
    public static void main(String[] args){
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(5);
        list1.add(6);
        list1.add(3);
        list1.add(1);
        
        System.out.println(list1);
        list1.addFirst(0);
        System.out.println(list1);
        // lets print the list size 
        int n = list1.size();
        System.out.println(n);
        for(int i = 0 ; i < n ; i++){
            System.out.print(list1.get(i) + " -> ");
        }
        System.out.println("NULL");
        // lets delete the First node 
        list1.removeFirst();
        System.out.println(list1);
        // lets delete the Last node 
        list1.removeLast();
        System.out.println(list1);
        // lets delete in a spacific node 
        list1.remove(1);
        System.out.println(list1);
    }
}