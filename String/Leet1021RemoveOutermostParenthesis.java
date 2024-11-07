package String;

import java.util.Stack;

public class Leet1021RemoveOutermostParenthesis {
    public static void main(String[] args) {
        String str = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(str));
    }
    public static String removeOuterParentheses(String s) {
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(stk.isEmpty() && s.charAt(i) == '('){
                stk.push(s.charAt(i));
                continue;
            }
            if(s.charAt(i) == '('){
                stk.push(s.charAt(i));
            }else{
                stk.pop();
                if(stk.isEmpty()){
                    continue;
                }
            }
            sb.append(s.charAt(i));


        }
        System.out.println(sb);
        return sb.toString();
    }
}
