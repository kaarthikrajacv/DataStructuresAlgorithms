package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SmallestWindowUnique {
    public static void main(String args[]){
        String input = "aabca";
        int count=0;
        Set<Character> characterSet = new HashSet<Character>();
        for(int i=0; i<input.length();i++){
            characterSet.add(input.charAt(i));
        }
        //System.out.println("Charset size = "+characterSet.size());
        int start = 0, end = 0, min = Integer.MAX_VALUE, minStart=0, minEnd=0;
        Map<Character, Integer> characterMap = new HashMap<Character, Integer>();
        int length = 0;
        while (start < input.length()){
        	count++;
            if(characterMap.keySet().size()<characterSet.size() && end<input.length()){

                    if(characterMap.containsKey(input.charAt(end))){
                        int s = characterMap.get(input.charAt(end));
                        characterMap.put(input.charAt(end), s+1);
                    }else{
                        characterMap.put(input.charAt(end), 1);
                    }
                    length++;
                if(length<min && characterMap.keySet().size()==characterSet.size()){
                    min = length;
                    minStart = start;
                    minEnd = end+1;
                }
                    end++;
            }
            else{
                if(start<input.length()){
                    Character c = input.charAt(start);
                    if(characterMap.containsKey(c) && characterMap.get(c)>1){
                        int s = characterMap.get(c);
                        characterMap.put(c, --s);
                    }else{
                        characterMap.remove(c);
                    }
                    start++;
                    length--;
                    if(length<min && characterMap.keySet().size()==characterSet.size()){
                        min = length;
                        minStart = start;
                        minEnd = end;
                    }
                }

            }
        }
        System.out.println("COUNTER IS " + count);
        System.out.println("One of the min windows = "+input.substring(minStart,minEnd)+" \n\tMin Length="+(min));
    }
}