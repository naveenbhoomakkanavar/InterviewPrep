Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true

class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> mappings = new HashMap<>();
        mappings.put('}','{');
        mappings.put(']','[');
        mappings.put(')','(');
        
        Stack<Character> stack = new Stack<Character> ();

        for (int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if (mappings.containsKey(c)){
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                
                if(topElement != mappings.get(c)){
                    return false;
                }
            }
            else 
                stack.push(c);
           }
        return stack.isEmpty(); 
    }
}
