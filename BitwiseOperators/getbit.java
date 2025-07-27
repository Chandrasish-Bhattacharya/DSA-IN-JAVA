public class getbit {
    public static void main(String[] args) {
        int n = 5 ; 
        int pos = 2 ;
        int bitmask = 1<<pos;
        int result = n & bitmask;
        if(result != 0){
            System.out.println("The bit at position "+pos+" is 1");
        }
        else System.out.println("The bit at position" + pos + " is 0");
    }
}
