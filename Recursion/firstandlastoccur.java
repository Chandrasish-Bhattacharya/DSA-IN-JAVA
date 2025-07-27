package Recursion;

public class firstandlastoccur {
    static int first = -1;
    static int last = -1;
    public static void occurerence(String str,char a,int idx){
        if(idx == str.length()) return;
        if( a == str.charAt(idx)) {
            if(first == -1) first = idx;
            else last = idx;
        }
        occurerence(str,a,idx+1);
}
    public static void main(String[] args) {
        occurerence("chandrasish",'a',0);
        System.out.println("First Occurence : " + first + " Last Occurence : " + last);
    }
    
}
