package Recursion;

public class reversestring {
    public static void str_reverse(String str , int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        str_reverse(str,idx-1);

    }
    public static void main(String[] args) {
        String str = "Chandrasish";
        str_reverse(str, str.length()-1);
    }
    
}
