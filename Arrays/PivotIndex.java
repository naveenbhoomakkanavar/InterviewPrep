Given an array of integers nums, write a method that returns the "pivot" index of this array.

We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.

If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.

Input: 
nums = [1, 7, 3, 6, 5, 6]
Output: 3
Explanation: 
The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
Also, 3 is the first index where this occurs.

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        
        for(int i : nums) sum += i;
        for(int i = 0; i < nums.length; i++){
            if(leftsum == sum - leftsum - nums[i])
                return i;
            leftsum += nums[i];
        }
        return -1;
    }
}
