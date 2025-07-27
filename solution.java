class solution{  //brute force
    public int maxArea(int[] height){
        class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int n = nums.length;
        for(int i = 0 ; i <n; i++){
            int mul = 1; 
            for(int j = 0 ; j <n;j++){
            if(i!=j) mul *= nums[j];
            }
            ans[i] = mul;
        }
        return ans;
    }

}
    }
}