class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;
        for(int n : nums) {
            if(map.containsKey(target - n)) {
                return new int[]{map.get(target - n), count};
            } else {
                map.put(n, count);
            }

            count++;
        }

        return new int[0];
    }
}
