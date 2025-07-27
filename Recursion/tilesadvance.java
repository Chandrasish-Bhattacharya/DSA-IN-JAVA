package Recursion;

public class tilesadvance {
    public static int countWays(int n,int m){
        
        if(n == m){
            return 2; // One way to place the tile vertically and one way to place it horizontally
        } else if(n < m){
            return 1; // Only one way to place the tile horizontally
        } else if(n == 0){
            return 1; // No tiles to place, one way to do nothing
        }
        // place the tile vertically
        int verticalPlacement = countWays(n - m, m);
        // place the tile horizontally
        int horizontalPlacement = countWays(n - 1, m);
        return verticalPlacement + horizontalPlacement; // count ways to tile the floor
    }
    public static void main(String[] args){
        int n = 4; // Length of the floor
        int m = 2; // Size of the tile
        int result = countWays(n, m);
        System.out.println("Number of ways to tile the floor: " + result);
    }
}
