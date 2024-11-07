package Array;

import java.util.Arrays;

public class Leet1775EqualSum {
    public static void main(String[] args) {
        int[] nums1 = {6,6};
        int[] nums2 = {1};
        System.out.println(minOperations(nums1,nums2));
    }
    public static int minOperations(int[] nums1, int[] nums2) {
        int sum1 = 0;
        int sum2 = 0;
        for(int num1 : nums1){
            sum1+=num1;
        }
        for(int num2 : nums2){
            sum2 += num2;
        }
        int delta = Math.abs(sum1-sum2);
        int[] bigger;
        int[] smaller;
        if(sum1 < sum2){
            bigger = nums2;
            smaller = nums1;
        }else{
            bigger = nums1;
            smaller = nums2;
        }
        System.out.println("Bigger -> "+ Arrays.toString(bigger));
        System.out.println("Smaller -> "+Arrays.toString(smaller));
        Arrays.sort(smaller);
        int step = 0;
        for (int i = 0; i < smaller.length; i++) {
            if(delta == 0){
                break;
            }
            int limit = 6 - smaller[i];
            if(limit <= 0){
                return -1;
            }
            if(limit <= delta){
                delta = delta - limit;
                smaller[i] = smaller[i]+limit;
                step++;
            }else{
                delta = 0;
                smaller[i] = smaller[i]+delta;
                step++;
            }

        }
        return step;
    }
}
