package strings;

public class IntegerToRomanConversion {

	public static void main(String[] args) {
		
		String roman = convertRoman(4);
		
		System.out.println("The Roman numeral is " + roman);

	}

	private static String convertRoman(int n) {
		
		
		String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		
		int[] div = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<div.length;) {
			
			if(n >= div[i]) {
				sb.append(roman[i]);
				n -= div[i];
			}else {
				i++;
			}
			
		}
		
		return sb.toString();
	}

}
