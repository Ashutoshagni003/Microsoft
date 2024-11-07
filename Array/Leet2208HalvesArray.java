package Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Leet2208HalvesArray {
    public static void main(String[] args) {
        System.out.println(halveArray(new int[]{5,19,8,1}));
    }
    public static int halveArray(int[] nums) {
        int count = 0;
        PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            pq.add((double)nums[i]);
            sum+=nums[i];
        }
        double newSum = sum;
        while(newSum > (sum/2)){
            double val = pq.remove();
            newSum -= val/2;
            val = val/2;
            pq.add(val);
//            newSum += val;
            count++;
        }

        return count;

    }
}
