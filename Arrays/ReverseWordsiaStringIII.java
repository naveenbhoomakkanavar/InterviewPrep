Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

public class Solution {
    public String reverseWords(String s) {
        char c[] = s.toCharArray();
        int i=0, j=0;
        int end=0;
        
        for(char cc : c){
            if(cc==' '){
                end = j-1;
                swap(c,i,end);
                i=j+1;
            }
            else if(j==s.length()-1)
            {
                end=j;
                swap(c,i,end);
                i=j+1;
            }
            j++;
        }
        return new String(c);
    }
    
    public void swap(char c[], int start, int end){
        
        while(start<end){
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
    }
}
