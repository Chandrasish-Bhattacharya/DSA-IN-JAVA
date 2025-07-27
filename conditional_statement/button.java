import java.util.Scanner;
class button{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1:Red");
        System.out.println("2:Green");
        System.out.println("3:Blue");
        System.out.print("Enter the number:");
        
        
        int butt = sc.nextInt();
        switch(butt){
            case 1: System.out.println("RED");
            break;
            case 2: System.out.println("Green");
            break;
            case 3: System.out.println("Blue");
            break;
            default: System.out.println("Sorry incorrect input");
        }
    }
}