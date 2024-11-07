package Array;

public class Leet1952ThreeDivisors {
    public static void main(String[] args) {
        System.out.println(isThree(0));
    }
    public static boolean isThree(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(count > 3){
                return false;
            }
            if(n%i == 0){
                count++;
            }
        }
        if(count == 3){
            return true;
        }
        return false;
    }
}
