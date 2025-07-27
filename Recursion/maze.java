package Recursion;

public class maze {
    public static int maze(int i, int j, int m , int n){
        // int i,j = 0;
        if(i == m-1 && j == n-1){
            return 0;
        }
        if(i == n-1 || j == m-1){
            return 1;
        }
        int downpath = maze(i+1,j , m , n);
        int rightpath = maze(i,j+1 , m , n);
        return downpath + rightpath;
    }
    public static void main(String[] args) {
        int m = 3, n = 3; // Size of the maze
        int result = maze(0, 0, m, n);
        System.out.println("Number of unique paths: " + result);
    }
    
}
