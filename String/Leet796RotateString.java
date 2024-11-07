package String;

public class Leet796RotateString {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde","cdeab"));
    }
    public static boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder();
        StringBuilder tb = new StringBuilder();
        while(s.indexOf(goal) != 0 && s.length() >1){
            sb.append(s.charAt(0));
            s = s.substring(1);
            tb.append(goal.charAt(goal.length()-1));
            goal = goal.substring(0,goal.length()-1);

        }
        System.out.println("s -> "+s);
        System.out.println("goal -> "+goal);
        System.out.println("SB -> "+sb.reverse());
        System.out.println("TB -> "+tb);
        if(s.length() == 0 && sb.reverse() != tb){
            return false;
        }else if(sb.reverse().equals(tb)){
            return true;
        }

//        System.out.println("s -> "+s);
//        System.out.println("goal -> "+goal);
//        System.out.println("SB -> "+sb.reverse());
//        System.out.println("TB -> "+tb);
        System.out.println(s);
        return true;
    }
}
