class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int[] result = new int[2];
        for(int n : numbers) {
            numMap.put(n, target - n);
        }

        for(int k : numMap.keySet()) {
            if(numMap.get(k) + k == target && k < numMap.get(k) && k != numMap.get(k)) {
                result[0] = k;
                result[1] = numMap.get(k);
                return result;
            }
        }

        return result;
    }
}
