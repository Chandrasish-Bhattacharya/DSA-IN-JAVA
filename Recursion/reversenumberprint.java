package Recursion;

import java.util.Scanner;

public class reversenumberprint {
    public static void pn(int n){
        if(n == 0) return;
        System.out.println(n);
        pn(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int n = sc.nextInt();
        pn(n);
        sc.close();
    }
}
