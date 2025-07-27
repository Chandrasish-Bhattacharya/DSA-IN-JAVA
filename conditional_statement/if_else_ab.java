import java.util.*;
class if_else_ab{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();
        if(a==b) System.out.println("Both are equal");
        else {
            if(a>b) System.out.println("A" + a + "is greater than" + b);
            else System.out.println("B" + b + "is greater than" + a);
            }
    }
}