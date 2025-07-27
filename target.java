import java.util.Scanner;
class target {
    public static void main(String[] args){
        int[][] arr = new int[4][4];
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc1.nextInt();
        System.out.println("Enter the elements of columns: ");
        int c = sc1.nextInt();
        for(int i = 0 ; i<r ; i++){
            for(int j = 0 ; j<c ; j++){
                arr[i][j] = sc1.nextInt();
            }
        
        }
        System.out.print("Enter target: ");
        int target = sc1.nextInt();
        for(int i = 0 ; i<r ; i++){
            for(int j = 0 ; j<c ; j++){
                if(target == arr[i][j]){
                    System.out.print("i :" +i  + "j:" + j);
                }
            }
        
        }
        sc1.close();
    }
}