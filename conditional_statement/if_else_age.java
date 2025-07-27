import java.util.Scanner;
public class if_else_age{
    public static void main(String[] args){
        // write a program for implementing age < 18 or not 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : \t");
        int age = sc.nextInt();
        if(age>=18) System.out.println("You are adult ");
        else System.out.print("You are not an adult");
    }
}