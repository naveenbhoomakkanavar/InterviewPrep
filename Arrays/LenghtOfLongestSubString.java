Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int n = s.length();
        int i = 0, j = 0 ,ans = 0;
        while(i < n && j < n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else
                set.remove(s.charAt(i++));
        }
        return ans; 
    }
}
