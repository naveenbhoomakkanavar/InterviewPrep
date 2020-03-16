Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.  Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.

 

Example 1:

Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]

public int[] relativeSortArray(int[] arr1, int[] arr2){
        Map<Integer,Integer> map = new HashMap<>();
        int counter = 0;
        for(int num: arr2) map.put(num,0);
        for(int i = 0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
                arr1[i] = -1;
            }
        }
        Arrays.sort(arr1);
        for(int num: arr2){
            int size = map.remove(num);
            while (size > 0){
                arr1[counter++] = num;
                size--;
            }
        }
        return arr1;
    }
