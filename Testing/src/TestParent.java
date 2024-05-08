import java.util.*;

public class TestParent {

 
static final Map<Character, Character> map = new HashMap<>();
 static {
	map.put(Character.valueOf('{'), Character.valueOf('}')); 
	map.put(Character.valueOf('['), Character.valueOf(']')); 
	map.put(Character.valueOf('('), Character.valueOf(')')); 
	
}
 
 public static void main(String[] args) {


     System.out.println( isValid("()"));
 }

public static boolean isValid(String s) {
	
	Stack<Character> stack = new Stack<>()	; // only opens   opens are in stack
	
	for(char c : s.toCharArray()) {
		
		if(map.containsKey(c)) {
			stack.push(c);
		}
		else {
			if(stack.isEmpty())
            {
                return false;
            }
			
			char open = stack.pop();
			if ( map.get(open) != c)
			{
				return false;
			}
			
		}
	}
	
	return stack.isEmpty();
}

}