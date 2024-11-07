package Array;

import java.util.Arrays;

public class Leet189RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        rotate(nums,3);
    }
    public static void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int target = (i+k) % nums.length;
            nums[target] = arr[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
