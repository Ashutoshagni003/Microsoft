package String;

public class Leet1945SumOfDigitOfString {
    public static void main(String[] args) {
        System.out.println(getLucky("leetcode",2));
    }
    public static int getLucky(String s, int k) {
        int a = 'z'-96;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i) - 96;
            sb.append(curr);
        }
//        System.out.println(sb);
        int finalSum = 0;
        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int j = 0; j < sb.length(); j++) {
//                System.out.println(sb.charAt(j)-48);
                sum+=(sb.charAt(j)-48);
            }
//            System.out.println("sum -> "+sum);
//            String str = sum +"";
            sb = new StringBuilder(sum+"");
            finalSum = sum;
        }
        return finalSum;
    }
}
