import java.util.ArrayList;
import java.util.List;

/**
 * BruteForce
 */
public class myLogic {

    public static  String removeOuterParentheses(String s) {

        List<String> re = new ArrayList<String>();
        String current = "";
        int open = 0;
        for(int i = 0;i<s.length(); i++){
            if(s.charAt(i)=='('){
                open = open +1;
                current = current +s.charAt(i);
            }
            if(s.charAt(i)==')' && open>0){
                open = open -1;
                current = current +s.charAt(i);
                if (open == 0) {
                    re.add(current.substring(1, current.length() - 1));
                    current = "";
                }
            } 
        }
        return String.join("", re);
    }

    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        String reString = removeOuterParentheses(s);
        System.out.println(reString);
    }
    
}
