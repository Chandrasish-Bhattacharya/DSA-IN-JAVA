package Recursion;

public class dublicateinstring{
    static boolean arr [] = new boolean[26];
    public static void removedublicate(String str , int i , String newString) {
        if( i == str.length()){
            System.out.println(newString);
            return ;
        }
        char curr = str.charAt(i);
        if(arr[curr - 'a'] == true) {
            removedublicate(str,i+1,newString);
        }else{
            newString+= curr;
            arr[curr - 'a'] = true;
            removedublicate(str, i+1, newString);
        }
    }
    public static void main(String[] args) {
        removedublicate("abbccda", 0, "");
    }
}