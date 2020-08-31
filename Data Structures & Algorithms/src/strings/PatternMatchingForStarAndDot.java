package strings;

public class PatternMatchingForStarAndDot {

	public static void main(String[] args) {
		
		String s = "cab";
		String p = "c*a*b";
		
		boolean result = isPatternMatched(s, p);
		
		System.out.println("The patter matching is " + result);

	}

	private static boolean isPatternMatched(String s, String p) {
		
		boolean[][] dp = new boolean[s.length()+1][p.length()+1];
		dp[s.length()][p.length()] = true;
		
		for(int i=s.length(); i>=0; i--) {
			for(int j=p.length()-1; j>=0; j--) {
				
				boolean first_match = (i<s.length() && (p.charAt(j) == s.charAt(i) || p.charAt(j)=='.'));
				if(j+1 < p.length() && p.charAt(j+1) == '*') {
					dp[i][j] = dp[i][j+2] || first_match && dp[i+1][j];
				}else {
					dp[i][j] = first_match && dp[i+1][j+1];
				}
				
			}
		}
		
		return dp[0][0];
	}

}