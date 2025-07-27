package Sorting;

public class insertionsort {

    public static void main(String[] args) {
        int[] nums = { 1, 9, 0, 8, 6 };
        for (int i = 1; i < nums.length; i++) {
            int curre = nums[i];
            int j = i - 1;
            while (j >= 0 && curre < nums[j]) {
                nums[j + 1] = nums[j];
                j--;

            }
            nums[j + 1] = curre;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}