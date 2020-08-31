package strings;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		
		String test = "cda";
		
		String output = longestPalindrome(test);
		
		System.out.println("The output String which is longest palindrome substring is " + output);

	}

	private static String longestPalindrome(String test) {
		
		if(test==null || test.length()<1) {
			return "";
		}
		int start=0, end=0;
		
		for(int i=0;i<test.length();i++) {
			
			int len1 = expandAroundCenter(test, i, i);
			
			int len2 = expandAroundCenter(test, i, i+1);
			
			int len = Math.max(len1, len2);
			
			if(len > end-start) {
				
				start = i - (len-1)/2;
				
				end = i+len/2;
			}
		}
		
		return test.substring(start, end+1);
	
	}

	private static int expandAroundCenter(String test, int left, int right) {
		
		while(left>=0 && right<test.length() && test.charAt(left)==test.charAt(right)) {
			left--;
			right++;
		}
		
		return right - left - 1;
	}

}
