Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        
        for(Integer i : nums1)
            s1.add(i);
        
        for(Integer i : nums2){
            if(s1.contains(i))
                s2.add(i);
        }
        
        int res[] = new int[s2.size()];
        int i = 0;
        for(Integer a : s2){
            res[i++] = a;
        }
        return res;
    }
}
