package backtracking;

public class power {
    public static double myPow(double x, int n) {
        double sum = 1;
        if(n<0){
        for(int i = 0 ; i > n ; i--){
            sum = 1/(sum * x);
        }        
    }
    else{
        for(int i = 0 ; i<n ; i++){
            sum *= x;
        }
    }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(myPow(2.00000 , -2));
    }
}
