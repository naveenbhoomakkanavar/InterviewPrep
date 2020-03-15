Given a non-empty array of integers, return the k most frequent elements.

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> freq = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((n1, n2) -> map.get(n1) - map.get(n2));
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
     
        for(Integer key : map.keySet()){
            pq.add(key);
            if(pq.size() > k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            freq.add(pq.poll());
        }
        Collections.reverse(freq);
        return freq; 
    }
}
