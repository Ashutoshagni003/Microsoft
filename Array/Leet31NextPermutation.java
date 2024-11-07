package Array;

import java.util.Arrays;

public class Leet31NextPermutation {
    public static void main(String[] args) {
        nextPermutation(new int[]{3,2,1});
    }
    public static void nextPermutation(int[] nums) {
        int pointer = nums.length-2;
        while(pointer >= 0 && nums[pointer] <= nums[pointer+1]){
            pointer--;
        }
        if(pointer >= 0){
            int i = nums.length-1;
            while(nums[pointer]>=nums[i]){
                i--;
            }
            int temp = nums[i];
            nums[i] = nums[pointer];
            nums[pointer] = nums[i];
        }
        reverse(pointer+1,nums);
    }
    public static void reverse(int index,int[] nums){
        int i = index;
        int j = nums.length-1;

        while( i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(nums));

    }
}
