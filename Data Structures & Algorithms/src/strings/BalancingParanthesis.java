package strings;

import java.util.HashMap;
import java.util.Stack;

public class BalancingParanthesis {

	private HashMap<Character, Character> mappings;
	
	
	public BalancingParanthesis() {
		
		mappings = new HashMap<>();
		
		mappings.put('}', '{');
		mappings.put(')', '(');
		mappings.put(']', '[');
	}
	
	public static void main(String[] args) {
		
		String expression = "{[]}()*";
		
		BalancingParanthesis bp = new BalancingParanthesis();
		
		System.out.println(bp.isValid(expression));

	}
	
	public boolean isValid(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<s.length();i++) {
			
			char c = s.charAt(i);
			
			if(mappings.containsKey(c)) {
				
				Character topElement = stack.isEmpty()? '#' : stack.pop();
				
				if(topElement != mappings.get(c)) {
					return false;
				}
				
			}else {
				stack.push(c);
			}
			
		}
		
		return stack.isEmpty();
		
	}

}
