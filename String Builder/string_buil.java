public class string_buil {
    // Why do we need string Bulder means what was the issue with normal string
    // Normal string is immutable in java
    // So when we are doing any operation on string it creates a new string object
    // in memory
    // and copies all the content of old string to new string object
    // This is inefficient and can lead to memory leak if we are doing this
    // operation frequently
    // So to avoid this we use string builder which is mutable in nature
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("HELLO"); // Creating the first string using string builder
        System.out.println(str);
        // lets find the char ar some location we will use the same functions as that of string 
        // string.CharAt(0)
        System.out.println(str.charAt(0)); // prints H
        // changing the char at some location 
        str.setCharAt(0, 'C');
        System.out.println(str);
        // insert some value in some position
        str.insert(0, "HI");
        System.out.println(str);
        // suppose i want to delete the HI from the String 
        str.delete(0,2);// end index are excluded 
        System.out.println(str);

    }
}
