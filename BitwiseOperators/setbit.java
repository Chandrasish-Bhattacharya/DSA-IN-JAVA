public class setbit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;
        int value = n|bitmask;
        System.out.println(value);
    }

}
