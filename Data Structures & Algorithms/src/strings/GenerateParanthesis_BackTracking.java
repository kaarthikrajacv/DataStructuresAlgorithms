package strings;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis_BackTracking {

	public static void main(String[] args) {
		
		List<String> ans = new ArrayList<>();
		
		backtrack(ans, "", 0, 0, 2);
		
		System.out.println(ans);

	}

	private static void backtrack(List<String> ans, String string, int i, int j, int k) {
		
		
		if(string.length() == k*2) {
			ans.add(string);
			return;
		}
		
		if(i<k) {
			backtrack(ans, string + "(", i+1, j, k);
		}
		if(j<i) {
			backtrack(ans, string + ")", i, j+1, k);
		}
		
		System.out.println("This is the stack");
	}

}
