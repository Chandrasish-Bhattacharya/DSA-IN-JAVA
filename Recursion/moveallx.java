package Recursion;

public class moveallx {
    static void moveallx(String s , int i , int count , String newString) {
        if(i == s.length()){
            for(int j = 0 ; j<count ; j++){
                newString = newString + 'x';
            }
            System.out.print(newString);
            return;
        } 
        if(s.charAt(i) == 'x'){
            count++;
        }
        else newString = newString + s.charAt(i);
        moveallx(s, i+1, count, newString);
    }
    public static void main(String[] args) {
        String s = "axbcxxd";
        moveallx(s, 0, 0, "");
    }
}