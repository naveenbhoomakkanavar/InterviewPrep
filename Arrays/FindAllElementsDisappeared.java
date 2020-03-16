Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        Map<Integer, Boolean> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], true);
        }
            
        for(int i = 1; i <= nums.length; i++){
            if(!map.containsKey(i)){
                res.add(i);
            }
        }
        
        
        
        return res;
    }
}
