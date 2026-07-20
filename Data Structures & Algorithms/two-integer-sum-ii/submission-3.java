class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        Map<Integer, Integer> indMap = new HashMap<>();
        int[] result = new int[2];
        // populate numMap and indMap
        int count = 1;
        for(int n : numbers) {
            numMap.put(n, target - n);
            indMap.put(n, count++);
        }

        for(int k : numMap.keySet()) {
            if(numMap.get(k) + k == target && k < numMap.get(k) && k != numMap.get(k) 
                && numMap.containsKey(numMap.get(k))) {
                    result[0] = indMap.get(k);
                    result[1] = indMap.get(numMap.get(k));
                    return result;
            }
        }

        return result;
    }
}
