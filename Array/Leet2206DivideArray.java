package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leet2206DivideArray {
    public static void main(String[] args) {
        System.out.println(divideArray(new int[]{3,2,4,2,2,2}));
    }
    public static boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        if(nums.length %2 != 0){
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() %2 != 0){
                return false;
            }
//            System.out.println("key : "+entry.getKey()+", value: "+entry.getValue());
        }
        return true;
//        Arrays.sort(nums);
//        int n = nums.length;
//        for(int i =0; i<nums.length; i+=2){
//            if(nums[i]!=nums[i+1])
//                return false;
//        }
//        return true;
    }

}
