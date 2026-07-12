class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        Arrays.sort(copy);
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for(int j = 0; j < copy.length; j++) {
            if(!(map.containsKey(copy[j]))) {
                map.put(copy[j], count++);
            }
        }
        
        int[] result = new int[arr.length];
        for(int k = 0; k < copy.length; k++) {
            result[k] = map.get(arr[k]);
        }

        return result;
    }
}