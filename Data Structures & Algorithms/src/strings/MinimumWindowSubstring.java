package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MinimumWindowSubstring {
	
	    public static String minWindow(String s, String t) {
	        Map<Character, Integer> map = new HashMap<>();
	        //String ans = "";
	        int begin = 0;
	        int end = 0;
	        Set<Character> unique = new TreeSet<Character>();
	        for(char c : s.toCharArray()) {
	            unique.add(c);
	        }
	        int numberOfUniques = 0;
	        int[] range = new int[2];
	        range[1] = Integer.MAX_VALUE;
	        char[] letters = s.toCharArray();
	        //char[] tArray = unique
	        
	        int count = 0;
	        for(char c : unique) {
	        	map.put(c, 1);
	        }
	        
	        numberOfUniques = map.size();
	        
	        
	        /*
	            if all characters in T are included in current substring -> shrink substring until false
	            if all characters in T are not included in current substring -> expand window
	        */
	        while(end < letters.length){
	            count++;
	            // window condition is not satisfied
	            if(numberOfUniques != 0){
	                
	                if(map.containsKey(letters[end])){
	                    map.put(letters[end], map.get(letters[end]) - 1);
	                    if(map.get(letters[end]) == 0){
	                        numberOfUniques--;
	                    }     
	                }
	 
	                end++;
	            }
	            
	            else if(numberOfUniques == 0) {
	            	
	                
	                while(begin < end && numberOfUniques == 0){
	                	count++;
	                    if(end - begin < range[1] - range[0]){
	                        range[0] = begin;
	                        range[1] = end; 
	                    }
	                    
	                    if(map.containsKey(letters[begin])){
	                        map.put(letters[begin], map.get(letters[begin]) + 1);
	                        if(map.get(letters[begin]) > 0)
	                            numberOfUniques++;
	                    }
	                    
	                    begin++;
	                }
	            }
	        }
	        
	        // move the begin pointer to the end and check for potential small substrings
	        while(begin < letters.length){
	        	count++;
	            if(numberOfUniques == 0){
	                
	                if(end - begin < range[1] - range[0]){
	                    range[0] = begin;
	                    range[1] = end; 
	                }
	                
	                if(map.containsKey(letters[begin])){
	                    map.put(letters[begin], map.get(letters[begin]) + 1);
	                        if(map.get(letters[begin]) > 0)
	                            numberOfUniques++;
	                }
	            }
	            begin++;
	        }
	        
	        System.out.println("Counter is " + count);
	        
	        // that means our range is still 0-0 
	        if(range[1] == Integer.MAX_VALUE) return "";
	        return s.substring(range[0], range[1]);
	    }
	    
	    
	    
	    public static void main(String[] args) {
			
	    	String s = "caabcd";
	    	String t = "aaabcd";
	    	System.out.println("String lenghth is " + s.length());
	    	System.out.println("Min window is " + minWindow(s,t));
		}
	}


