package Array;

import java.util.HashMap;
import java.util.Map;

public class Leet136SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
    public static int singleNumber(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
//            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
        return 0;
    }
}
