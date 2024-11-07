package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLeaders {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        System.out.println(leaders(arr.length,arr));
    }
    public static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int rightMax = arr[arr.length-1];
        for (int i = arr.length-1; i >= 0 ; i--) {
            if(arr[i] >= rightMax){
                list.add(0,arr[i]);
                rightMax = arr[i];
            }
        }
        return list;
    }
}
