package Recursion;

public class towelofhanoi {
    public static void towelofhanoi(int n, String source, String helper , String destination){
        if(n==1){
            System.out.println("Disk "+ n + " moved from "+ source + " to " + destination);
            return;
        }
        towelofhanoi(n-1, source, destination, helper);
        System.out.println("Disk "+ n + " moved from "+ source + " to " + destination);
        towelofhanoi(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        int n = 2;
        towelofhanoi(n, "A", "B", "C");

    }
}
