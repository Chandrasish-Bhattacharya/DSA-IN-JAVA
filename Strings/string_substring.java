public class string_substring {
    public static void main(String[] args) {
        String str = "Hello World!";
        // Function that we will be using sunstring function basically it take 1 values
        // the start index and the end index based on which it returns it value
        // it also counts space as a character
        // it does not include the endIndex value
        String substring = str.substring(0, 5);
        System.out.println(substring);
    }
}
