package Recursion;

import java.util.Scanner;

public class factorial {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int factorial = n * factorial(n-1);
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for which you want the factorial");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
