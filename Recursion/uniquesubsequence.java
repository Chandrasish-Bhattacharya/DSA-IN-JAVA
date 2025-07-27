package Recursion;

import java.util.HashSet;

public class uniquesubsequence {
   
    public static void subsequence(int idx, String str , String newsString , HashSet<String> set){
        if(idx == str.length()){
           if(set.contains(newsString)){
            return;
           }else{
            set.add(newsString);
            System.out.println(newsString);
            return;
           }
            
        }
        subsequence(idx+1, str, newsString+str.charAt(idx),set);
        subsequence(idx+1, str, newsString,set);
    }
    public static void main(String[] args ){
        String str = "aaa";
        HashSet <String> set = new HashSet<>();
        subsequence(0,str , "",set);
    }
    
}

