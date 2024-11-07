package String;

import java.math.BigInteger;
import java.util.ArrayList;

public class Leet2259RemoveDigit {
    public static void main(String[] args) {
        System.out.println("ans -> "+removeDigit("143231630",'3'));
    }
    public static String removeDigit(String number, char digit) {
        int n = number.length();
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(number.charAt(i) == digit){
                index = i;
                if( i < n && number.charAt(i) < number.charAt(i)){
                    break;
                }
            }
        }
        return number.substring(0,index) + number.substring(index+1);
    }
}
