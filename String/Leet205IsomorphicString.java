package String;

import java.util.HashMap;

public class Leet205IsomorphicString {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc","baba"));
    }
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mapS = new HashMap<>();
        HashMap<Character,Character> mapT = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!mapS.containsKey(sChar)){
                mapS.put(sChar,tChar);
            }else{
                if(mapS.get(sChar) != tChar){
                    return false;
                }
            }
            if(!mapT.containsKey(tChar)){
                mapT.put(tChar,sChar);
            }else{
                if(mapT.get(tChar) != sChar){
                    return false;
                }
            }
        }
//
        return true;
    }
}
