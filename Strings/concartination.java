import java.util.Scanner;
public class concartination{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Name");
        String firstname = sc.next();
        System.out.print("Enter the Last Name: ");
        String lastname = sc.next();
        String Fullname = firstname+lastname;
        System.out.print(Fullname);

        sc.close();

    }
}