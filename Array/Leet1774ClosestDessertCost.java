package Array;

import java.util.ArrayList;
import java.util.List;

public class Leet1774ClosestDessertCost {
    public static void main(String[] args) {
        int[] baseCosts = {1,7};
        int[] toppingCosts = {3,4};
        System.out.println(closestCost(baseCosts,toppingCosts,17));
    }
    static int maxAnswer = 0;
    static int max = 0;
    public static int closestCost(int[] baseCosts, int[] toppingCosts, int target) {

        for (int i = baseCosts.length-1; i >= 0; i--) {
            int newTarget = target - baseCosts[i];
            helper(toppingCosts,newTarget,0,0,0);
//            int j = toppingCosts.length-1;
//            int toppingCount = 0;
//            while( j >= 0){
//                if(newTarget == 0){
//                    break;
//                }
//                int toppingCost = toppingCosts[j];
//                if(newTarget - toppingCost < 0 || toppingCount >= 2){
//                    toppingCount = 0;
//                    j--;
////                    continue;
//                }else{
//                    newTarget = newTarget - toppingCost;
//                    toppingCount++;
//                }
//            }
//            maxAnswer = Math.max(maxAnswer,target - newTarget);
        }
        return max;
    }
    public static void helper(int[] toppingCosts,int newTarget,int index,int sum,int count){
        int toppingCost = toppingCosts[index];
        sum = sum + toppingCost;

        if(count >= 2 ){
            return;
        }
        if(index >= toppingCosts.length){
            return;
        }

        if(sum >= newTarget){
            max = Math.max(sum-toppingCost,max);
            return;
        }

        helper(toppingCosts, newTarget,index,sum,count+1);
        helper(toppingCosts,newTarget,index+1,sum,0);

    }
}
