package Recursion;

public class xtopower {
    public static int xtothepower(int x,int n){
        if (n == 0)return 1;
        else if(x==0) return 0;
        
        int xtopow1 = xtothepower(x,n-1);
        int xpow = x*xtopow1;
        return xpow;
    }
    public static void main(String[] args){
        System.out.println(xtothepower(2,3));
    }
}
