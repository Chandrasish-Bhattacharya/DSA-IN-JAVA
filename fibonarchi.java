class fibonarchi{
    public static int fibonarchi(int n) {
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonarchi(n-1)+fibonarchi(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibonarchi(5));
    }
}