package strings;

public class ZigZagConversionOfString {

	public static void main(String[] args) {
		
		String s = "paypalishiring";
		int noOfRows = 3;
		
		String zigzagConvertedString = convert( s, noOfRows);
		
		System.out.println("The zigzag converted string is " + zigzagConvertedString);

	}

	private static String convert(String s, int noOfRows) {
		
		
		if(noOfRows==1) {
			return s;
		}
		
		StringBuilder sb = new StringBuilder();
		
		int cycleLength = 2 * noOfRows - 2;
		
		for(int i = 0; i<noOfRows; i++) {
			for(int j=0; j + i <s.length();j+= cycleLength) {
				sb.append(s.charAt(i+j));
				if(i!=0 && i!=noOfRows-1 && j+cycleLength-i< s.length()) {
					sb.append(s.charAt(j + cycleLength - i));
				}
			}
		}
	
		return sb.toString();
	}

}
