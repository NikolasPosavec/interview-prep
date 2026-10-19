class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int[] arr = new int[k];
        int count = 0;
        while(count < k) {
            int greatest = nums[0];
            for(int j = 0; j < nums.length; j++) {
                if(map.containsKey(j) && map.get(greatest) < map.get(j)) {
                    greatest = nums[j];
                }
            }
            arr[count++] = greatest;
            map.remove(greatest);
        }

        return arr;
    }
}

/* 
1. go thru nums and create map
-
e.g.
nums = [1 1 1 2 2 3 3 3 3]
k(num) v(freq)
1      3
2      2
3      4
-
2. create an array with k elements
3. loop k times and each iteration find the largest value then add it to array and remove from map
*/