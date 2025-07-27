class string_Conpare{
    public static void main(String[] args){
        //here we will be using the String1.compareTo(String2) 
        // if == 0 then they are same if we have a ne value then the 2nd string is greater 
        // basically it compares the first name dissimilar character
        // String st1 = "Hello"; 
        // String st2 = "Hello";
        // equal 
        String st1 = "Hello"; 
        String st2 = "Hellooo";
        if(st1.compareTo(st2)==0){
            System.out.print("Both string are equal");
        }else System.out.println("Both are not equal");
        }
}