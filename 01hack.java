import java.util.*;

public class 01hack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine(); // Consume the newline after the integer

        for (int i = 0; i < T; i++) {
            String s = scan.nextLine();
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();

            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    even.append(s.charAt(j));
                } else {
                    odd.append(s.charAt(j));
                }
            }

            System.out.println(even + " " + odd);
        }
        scan.close();
    }
}
