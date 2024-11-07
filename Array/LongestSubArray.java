package Array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] nums = {-13, 0, 6, 15, 16, 2 ,15, -12, 17, -16, 0 ,-3 ,19, -3, 2, -9, -6};
        int N = nums.length;
        int K = 15;
        System.out.println(lenOfLongSubarr(nums,N,K));
    }
    public static int lenOfLongSubarr(int A[], int N, int K) {
        // Complete the function
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefix_sum = 0;
        int maxLength = 0;
        for(int i = 0; i < N; i++){
            prefix_sum+=A[i];

            if(prefix_sum == K){
                maxLength = i+1;
            }


            if(map.containsKey(prefix_sum - K)){
                maxLength = Math.max(maxLength,i - map.get(prefix_sum-K));
            }
            if(!map.containsKey(prefix_sum)){
                map.put(prefix_sum,i);
            }
        }
        return maxLength;
    }
}
