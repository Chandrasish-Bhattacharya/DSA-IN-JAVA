// 189. Rotate Array
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
class rotateArray {
    // public int[] rotate(int[] nums, int k){  // my approach 
    //     int j = 0;
    //     if(nums.length == 0 || k < 0) return nums;

    //     // Ensure k doesn't exceed array length
    //     k = k % nums.length;

    //     while(j < k){
    //         int last = nums[nums.length - 1];

    //         // Shift elements right by one position
    //         for(int i = nums.length - 1; i > 0; i--){
    //             nums[i] = nums[i - 1];
    //         }

    //         nums[0] = last;
    //         j++;
    //     }

    //     return nums;
    // }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }        
    }

    public static void main(String[] args) {
        
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
         // Changed to use object r
        rotate(nums , k);
        for(int i : nums) {
            System.out.print(i + " ");
        }
    }
}