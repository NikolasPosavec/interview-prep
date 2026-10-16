class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int j = 0; j < nums.length; j++) {
            int dif = target - nums[j];
            if(map.containsKey(dif) && map.get(dif) != j) {
                if(j < map.get(dif)) {
                    result[0] = j;
                    result[1] = map.get(dif);
                } else {
                    result[0] = map.get(dif);
                    result[1] = j;
                }
                return result;
            }
        }
        return result;
    }
}
