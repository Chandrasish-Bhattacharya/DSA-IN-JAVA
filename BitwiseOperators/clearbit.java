public class clearbit {
    public static void main(String[] args) {
     int n = 5; 
    int pos = 2;
    int bitmask = 1 <<pos;
    int result = (n&~bitmask); 
    System.out.print(result);   
    }
}
