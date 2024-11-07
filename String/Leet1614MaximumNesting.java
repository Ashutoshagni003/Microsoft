package String;

import java.util.Stack;

public class Leet1614MaximumNesting {
    public static void main(String[] args) {
        System.out.println(maxDepth("()(())((()()))"));
    }
    public static int maxDepth(String s) {
        int ans = 0;
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                stk.push(s.charAt(i));
                ans = Math.max(ans,stk.size());
            }else if(s.charAt(i) == ')') {
                stk.pop();
            }
        }
        return ans;
    }
}
