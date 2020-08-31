package strings;

import java.util.*;

public class NumberPadLetterCombination {
	static Map<String, String> phone = new HashMap<String, String>() {{
	    put("2", "abc");
	    put("3", "def");
	    put("4", "ghi");
	    put("5", "jkl");
	    put("6", "mno");
	    put("7", "pqrs");
	    put("8", "tuv");
	    put("9", "wxyz");
	  }};


	  static List<String> op = new ArrayList<>();


	public static void main(String[] args) {
		
		System.out.println(letterCombinations("234"));
	
		

	}


	private static List<String> letterCombinations(String string) {
		
		if(string.length() != 0) {
			recurse("", string);
		}
		
		return op;
		
	}


	private static void recurse(String combination, String next_digits) {
		
		if(next_digits.length() == 0) {
			op.add(combination);
		}
		
		else {
			
			String digit  = next_digits.substring(0, 1);
			
			String letters = phone.get(digit);
			
			for(int i=0; i<letters.length(); i++) {
				
				//String letter = phone.get(digit).substring(i, i+1);
				
				char letter = letters.charAt(i);
				
				recurse(combination + letter, next_digits.substring(1));
				
			}
			
			
		}
		
	}

}