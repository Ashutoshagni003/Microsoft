package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet153Sum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            if(i > 0 && nums[i] == nums[i-1]){
                i++;
            }
            int j = i+1;
            int k = nums.length-1;
            while( j < k){
                int sum = nums[i]+nums[j]+nums[k];

                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while( j < k && nums[j] == nums[j+1]){
                        j++;
                    }
                    while( j < k && nums[k] == nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                }else{
                    k--;
                }
            }
        }
        int[][] res = new int[ans.size()][];
        for(int i=0; i< ans.size();i++){
            for (int j = 0; j < 2; j++) {
                res[i][j] = ans.get(i).get(j);
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
        return ans;
    }
}
