

public class pallindrome {
    // Optimized : using 2 pointers so in this case i will be taking 2 pointers namely the left and right pointer 
    public static boolean isPalindrome(String s){
        String sn = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = s.length() - 1;
        while(left<right){
            if(sn.charAt(left) != sn.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Brute Force 
    // public static String removespace(String s){
    //     return s.replaceAll("[^a-zA-Z0-9]", "");

    // }
    // public static boolean pallindrome(String s){
    //     String newstring = removespace(s).toLowerCase();
    //     System.out.println(newstring);
    //     String rev = "";
    //     for (int i = newstring.length() -1 ; i>=0; i--) {
    //         rev+= newstring.charAt(i);
    //     }
    //     return newstring.equals(rev);

    // }
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        // System.out.println(removespace(s));
        if(isPalindrome(s)){
            System.out.println("Yes it is pallindrome");
        }
        else{
            System.out.println("It is not a pallirome");
        }
    }
}
