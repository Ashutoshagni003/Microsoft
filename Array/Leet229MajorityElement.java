package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leet229MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1,2}));
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int target = nums.length/3;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > target){
                ans.add(entry.getKey());
            }
        }

        return ans;
    }
}
