package strings;

public class StringContainsSubstring {

	public static void main(String[] args) {
		
		int index = findStringContains("Hello", "eln");
		
		System.out.println(index);

	}

	private static int findStringContains(String haystack, String needle) {
		
		if(needle.length() == 0) {
            return 0;
        }
        if(needle.length() > haystack.length()) {
            return -1;
        }
        int  j = 0, firstIndex = -1;
        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(j)) {
                if(firstIndex == -1) {
                    firstIndex = i; 
                }
                j++;
            } else {
                i = i -j; //reset the pointers
                j = 0;
                firstIndex = -1;
            }
            if(j == needle.length()) {
                return firstIndex;
            }
        }
        return -1;
	}

}
