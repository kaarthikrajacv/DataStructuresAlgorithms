package strings;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] input = {"Reehman","Leet", "Tee"};
		
		String output = findLCPByVerticalScanning(input);
		
		System.out.println("The Longest Common Prefix is " + output);

	}

	private static String findLCPByVerticalScanning(String[] input) {
		
		if(input==null || input.length==0) return "";
		
		for(int i=0; i<input[0].length();i++) {
			
			char c = input[0].charAt(i);
			
			for(int j=1; j<input.length; j++) {
				
				if(i==input[j].length() || input[j].charAt(i) != c) {
					
					return input[0].substring(0, i);
				}
				
			}
			
			
			
		}
		
		
		return input[0];
	}

}
