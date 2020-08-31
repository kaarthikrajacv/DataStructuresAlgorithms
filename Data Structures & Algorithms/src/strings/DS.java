package strings;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/**
 * @author santhosh mohan
 */
public class DS  {
  public static void main(String[] args) {
    String input = "{[]}() &";
   Map<Character, Character> pair = new HashMap<>();
   pair.put(')','(');
   pair.put(']','[');
   pair.put('}','{');
   Set<Character> open = new HashSet<>(pair.values());
   Set<Character> close = new HashSet<>(pair.keySet());
    Deque<Character> stack = new ArrayDeque<Character>();
    boolean valid = true;
if(input.length()%2 == 1){
      System.out.println(false);
      return;
    }
    for(char c : input.toCharArray()){
      if(open.contains(c)){
        stack.push(c);
      }
      if(close.contains(c)){
        if(stack.isEmpty()){
          valid = false;
          break;
        }else{
        char temp = stack.peek();
          if(temp==pair.get(c)){
            stack.pop();
          }else{
           valid = false;
           break;
          }
        }
      }
    }
    System.out.println(valid && stack.isEmpty());
  }
}