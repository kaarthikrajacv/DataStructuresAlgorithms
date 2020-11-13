package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubstringConcatenationAllWords {

	public static void main(String[] args) {
		
		String word = "barfoofoobarthefoobarman";
		
		String[] words = {"bar", "foo", "the"};
		
		List<Integer> indeces = getIndecesForString(word, words);
		
		System.out.println(indeces);

	}

	private static List<Integer> getIndecesForString(String word, String[] subs) {
		
		List<Integer> output = new ArrayList<Integer>();
		
		Set<String>  subWords= new HashSet<>();
		
		subWords.addAll(Arrays.asList(subs));
		
		int totalSubs = subs.length;
		
		int oneSubLength = subs[0].length();
		
		int startIndex = 0;
		
		int index = 0;
		
		int counter = 0;
		
		while(startIndex < word.length() - oneSubLength) {
			
			if(subWords.contains(word.substring(startIndex, startIndex+oneSubLength))){
				
				startIndex += oneSubLength;
				counter++;
				
				if(counter >= totalSubs) {
					output.add(index);
					index = index + oneSubLength;
				}
			}else {
				counter = 0;
				startIndex ++;
				index = startIndex;
			}
			
			
			
		}
		
		return output;
	}

}
