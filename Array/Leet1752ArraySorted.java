package Array;

import java.util.Arrays;

public class Leet1752ArraySorted {
    public static void main(String[] args) {
        System.out.println(check(new int[]{5,5,6,6,6,9,1,2}));
    }
    public static boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                count++;
            }
        }
        if(nums[nums.length-1]>nums[0])
        {
            count++;
        }
        return count<=1;
    }
}
