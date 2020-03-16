Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2  ; i++){
            for (int j = i + 1; j < nums.length - 1; j++){
                int target = - (nums[i] + nums[j]);
                int index = Arrays.binarySearch(nums, j + 1, nums.length, target);
                if (index >  0){
                    List<Integer> list = Arrays.asList(nums[i], nums[j], nums[index]);
                    set.add(list);
                }
            }
            
        }
        return new ArrayList<>(set);
    }
}
