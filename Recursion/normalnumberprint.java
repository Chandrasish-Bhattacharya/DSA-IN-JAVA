package Recursion;

public class normalnumberprint {
    public static void printnumber(int n,int max){
    if(n==max)return;
    System.out.println(n);
    printnumber(n+1,max);
    }
    public static void main(String[] args) {
        int n = 5;
        int max = 9;
        printnumber(n , max);
    }
    
}
