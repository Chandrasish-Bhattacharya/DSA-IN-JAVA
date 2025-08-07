import java.util.HashSet;
public class hash_set{
    public static void main(String[] args){
        // creating hash set 
        HashSet<Integer> set = new HashSet<>();
        // inserting elements
        set.add(5);
        set.add(10);
        set.add(2);
        set.add(2);
        set.add(3);

        // searching for an element
        if(set.contains(2)){
            System.out.println("Set contains 2");
        } else {
            System.out.println("Set does not contain 2");
        }
        set.remove(2);
        if(!set.contains(2)){
            System.out.println("Set does not contain 2");
        } else {
            System.out.println("Set contains 2");
        }
        // lets print the size of the set
        System.out.println("Size of the set: " + set.size());
    }
    


    
}