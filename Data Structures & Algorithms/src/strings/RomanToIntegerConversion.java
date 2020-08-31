package strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerConversion {

	public static void main(String[] args) {
		
		int convertedInteger = convertToInteger("VII");
		
		System.out.println("The converted integer is " + convertedInteger);

	}

	private static int convertToInteger(String s) {
		
		Map<Character, Integer> rMapping = new HashMap<Character, Integer>();
		rMapping.put('I', 1);
		rMapping.put('V', 5);
		rMapping.put('X', 10);
		rMapping.put('L', 50);
		rMapping.put('C', 100);
		rMapping.put('D', 500);
		rMapping.put('M', 1000);
		
		int result = rMapping.get(s.charAt(s.length()-1));
		
		for(int i=s.length()-2; i>=0; i--) {
			 
			if(rMapping.get(s.charAt(i))>= rMapping.get(s.charAt(i+1))) {
				result+= rMapping.get(s.charAt(i));
			}else {
				result -= rMapping.get(s.charAt(i));
			}
			
		}
		
		
		return result;
	}

}
