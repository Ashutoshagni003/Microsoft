package Array;

import java.util.Arrays;

public class Leet2028FindMissingObservations {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(missingRolls(new int[]{3,5,3},5,3)));
    }
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int[] ans = new int[n];
        int sum = 0;

        for(int num : rolls){
            sum+=num;
        }
        System.out.println("sum -> "+sum);

        int target = (mean * (rolls.length + n)) - sum;
        System.out.println("target -> "+target);

        int min = target / n;
        System.out.println("min ->"+min);
        if(min > 6 || min < 0){
            return new int[0];
        }

        if( min * n <= target){
            int diff = target - (min * n);
            System.out.println("diff -> "+diff);

            if(min + diff > 6 ){
                int limit = 6 - min;
                System.out.println("limit->"+limit);
                if(limit > 0){
                    int cal = diff/limit;
                    while(cal * limit < diff){
                        cal++;
                    }
                    System.out.println("cal ->"+cal);
                    if( n < cal){
                        return new int[0];
                    }
                    for (int i = 0; i < n; i++) {
                        ans[i] = min;
                    }
                    int checkSum = 0;
                    for (int i = n-1; i > n-cal-1; i--) {

                        ans[i] = ans[i]+limit;
                        System.out.println(ans[i]);
                        checkSum+=limit;
                    }
                    if(checkSum > diff){
                        ans[ans.length-1] = ans[ans.length-1] - (checkSum-diff);
                    }
                    return ans;
                }else{
                    return new int[0];
                }


            }
            for (int i = 0; i < n; i++) {
                ans[i] = min;
            }
            ans[ans.length-1] = ans[ans.length-1] + diff;
        }

        return ans;
    }
}
