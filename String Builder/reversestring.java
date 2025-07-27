public class reversestring {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Chandrasish");
        for(int i = 0 ; i<str.length()/2 ; i++){
            int first = i;
            int last = str.length() - 1 -i;
            char firchar = str.charAt(first);
            char lastchar = str.charAt(last);
            str.setCharAt(first, lastchar);
            str.setCharAt(last, firchar);
        }
        System.out.println(str);
    }    
}
