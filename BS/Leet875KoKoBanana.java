package BS;

import java.util.Arrays;

public class Leet875KoKoBanana {
    public static void main(String[] args) {
        int[] arr = {30,11,23,4,20};
        System.out.println(minEatingSpeed(arr,5));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int k = 0;
        Arrays.sort(piles);
        if(h == piles.length){
            return piles[piles.length-1];
        }
        for (int i = 0; i < piles.length; i++) {
            int curr = piles[i];
            for (int j = 0; j < piles.length; j++) {
                k += piles[j]/curr;
                if(piles[j] % curr != 0){
                    k+=1;
                }
                if(k > h){
                    k = 0;
                    break;
                }
            }
            if( k == h){
                return curr;
            }else if(k != 0 && k < h){
                if( i > 0){
                    System.out.println("curr -> "+(piles[i-1]+1));
                    return checkRange(piles,piles[i-1]+1,curr,h);
                }else{
                    System.out.println("curr -> "+curr);
                    return checkRange(piles,0,curr,h);
                }

            }
        }
        return piles[piles.length-1];
    }
    public static int checkRange(int[] piles,int start,int end,int h){
        int k = 0;
        for (int i = start; i < end; i++) {
            int curr = i;
            for (int j = 0; j < piles.length; j++) {
                k += piles[j]/curr;
                if(piles[j] % curr != 0){
                    k+=1;
                }
                if(k > h){
                    k = 0;
                    break;
                }
            }
            if( k == h){
                return curr;
            }
        }
        return end-1;

    }
}
