package Recursion;

public class subsequence {
    public static void subsequence(int idx, String str , String newsString){
        if(idx == str.length()){
            System.out.println(newsString);
            return;
        }
        subsequence(idx+1, str, newsString+str.charAt(idx));
        subsequence(idx+1, str, newsString);
    }
    public static void main(String[] args ){
        String str = "abc";
        subsequence(0,str , "");
    }
    
}
