class Solution {
    public int romanToInt(String str) {
        if(str == null || str.length() == 0) 
            return -1;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int len = str.length(), result = map.get(str.charAt(len-1));
        for(int i = len - 2; i >= 0; i--){
          if(map.get(str.charAt(i)) >= map.get(str.charAt(i+1)))
              result += map.get(str.charAt(i));
            else
                result -= map.get(str.charAt(i));
        }
        return result; 
    }
}
