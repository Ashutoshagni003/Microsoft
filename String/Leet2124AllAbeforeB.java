package String;

public class Leet2124AllAbeforeB {
    public static void main(String[] args) {
        System.out.println(checkString(""));
    }
    public static boolean checkString(String s) {
        char a = 'a';
        char b = 'b';
        boolean bOccur = false;
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) == 'a') {
                if (bOccur) {
                    return false;
                }
            } else if (s.charAt(i) == 'b') {
                bOccur = true;
            }


        }
        return true;
    }
}
