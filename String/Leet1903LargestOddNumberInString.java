package String;

public class Leet1903LargestOddNumberInString {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("35427"));
    }
    public static String largestOddNumber(String num) {
        System.out.println("flower".indexOf("flower"));
        for (int i = num.length()-1; i >= 0; i--) {
            int n = (int)num.charAt(i) - 48;
            if(n % 2 != 0 ){
                return num.substring(0,i+1);
            }
        }

        return "";
    }
}
