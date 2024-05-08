import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {


        System.out.println( isValid("( ok )"));
    }

    private static final Map<Character,Character> map = Map.of('{','}', '(',')', '[',']');
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray())
        {
            if (map.containsKey(c)){
                stack.push(c);
            }
            else{

                if(stack.isEmpty())
                {
                    return false;
                }
                char open = stack.pop();
                if(map.get(open) != c ){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
