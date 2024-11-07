package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Leet56MergeIntervals {
    public static int[][] merge(int[][] arr) {
        int n = arr.length;

        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // if the current interval does not
            // lie in the last interval:
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            // if the current interval
            // lies in the last interval:
            else {
                ans.get(ans.size() - 1).set(1,
                        Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
            }
        }
        int[][] res = new int[ans.size()][2];
        System.out.println(ans.size());
        System.out.println(ans);
        for(int i=0; i< ans.size();i++){
            for (int j = 0; j < 2; j++) {
                res[i][j] = ans.get(i).get(j);
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
        return res;

    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };
        merge(arr);
    }
}
