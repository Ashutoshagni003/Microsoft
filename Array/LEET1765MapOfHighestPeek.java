package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LEET1765MapOfHighestPeek {
    public static void main(String[] args) {
        int[][] isWater = {
                {1}
        };
        int[][] ans = highestPeak(isWater);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    public static int[][] highestPeak(int[][] isWater) {
        int[][] ansMatrix = new int[isWater.length][isWater[0].length];
        for (int i = 0; i < isWater.length; i++) {
            for (int j = 0; j < isWater[i].length; j++) {
                if(isWater[i][j] == 0){
                    ansMatrix[i][j] = 1;
                }else{
                    ansMatrix[i][j] = 0;
                }
            }
            System.out.println(Arrays.toString(ansMatrix[i]));
        }

        for (int i = 0; i < ansMatrix.length; i++) {
            for (int j = 0; j < ansMatrix[0].length; j++) {
                if(allSame(ansMatrix, i, j )){
                    if(ansMatrix[i][j] == 2){
                        ansMatrix[i][j] = 1;
                    }else if(ansMatrix[i][j] == 1){
                        ansMatrix[i][j] = ansMatrix[i][j] + 1;
                    }
                }
            }

        }
        return ansMatrix;

    }

    private static boolean allSame(int[][] ansMatrix, int row, int col) {
        int[] rowDirection = {-1,0,1,0};
        int[] colDirection = {0,1,0,-1};
        for (int i = 0; i < 4; i++) {
            int curr = ansMatrix[row][col];
            int newRow = row+rowDirection[i];
            int newCol = col + colDirection[i];
            if(newRow >= 0 && newRow < ansMatrix.length && newCol >= 0 && newCol < ansMatrix[row].length){
                if(curr != ansMatrix[newRow][newCol]){
                    return false;
                }
            }
        }
        System.out.println((int)Math.log10(10)+1);
        return true;
    }
}
