package Array;

import java.math.BigInteger;

public class Leet1822SignOfProduct {
    public static void main(String[] args) {
        System.out.println(arraySign(new int[]{9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24}));
    }
    public static int arraySign(int[] nums) {
        boolean negative = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0){
                negative = !negative;
            }
            if(nums[i] == 0){
                return 0;
            }
        }
        if(negative){
            return -1;
        }else{
            return 1;
        }
    }

}
