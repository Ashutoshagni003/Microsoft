package String;

public class Leet1910RemoveAllOccurences {
    public static void main(String[] args) {
        System.out.println(removeOccurrences("axxxxyyyyb","xy"));
    }
    public static String removeOccurrences(String s, String part) {
        if(!s.contains(part)){
            return s;
        }
        int i = s.indexOf(part);
        String newStr = s.substring(0,i)+s.substring(i+part.length());
        return removeOccurrences(newStr,part);

    }

}
