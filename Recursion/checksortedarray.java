package Recursion;
// this program checks if the array is strictly increasing or not
public class checksortedarray {
    // public static boolean isSorrted(int[] arr,int idx){
    //     if(idx == arr.length-1){
    //       return true;  
    //     }
    //     if(arr[idx] < arr[idx+1])
    //     return isSorrted(arr, idx+1); //return the as it is value from the next index
    //     else return false;  
    // }
    public static boolean isSorrted(int[] arr,int idx){
    if(idx == arr.length-1) return true; 
    if(arr[idx] >= arr[idx+1]){
        return false;
    }
    return isSorrted(arr, idx+1);
}
    public static void main(String[] args) {
        int[] arr = {1,2,3,3};
        System.out.println(isSorrted(arr, 0));
    }

// Can I reverse it


}

 
