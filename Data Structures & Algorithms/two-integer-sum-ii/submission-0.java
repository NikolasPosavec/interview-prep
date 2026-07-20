class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int n : numbers) {
            map.put(n, target - n);
        }

        for(int k : map.keySet()) {
            if(map.get(k) + k == target && k < map.get(k) && k != map.get(k)) {
                result[0] = k;
                result[1] = map.get(k);
                return result;
            }
        }

        return result;
    }
}
