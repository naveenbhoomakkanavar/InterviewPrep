Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

 

Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]

class Solution {
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        
        for(int i = 0; i < A.length; i++){
            result[i] = A[i] * A[i];
        }
        Arrays.sort(result);
        return result; 
    }
}
