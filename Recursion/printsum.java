package Recursion;

public class printsum {
    public static void sum(int i , int max , int sum){
        if(i == 1){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        sum(i-1,max,sum);
    }
    public static void main(String[] args) {
        sum(5,5,0);
    }
    
}
