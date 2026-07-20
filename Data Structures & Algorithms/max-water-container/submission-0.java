class Solution {
    public int maxArea(int[] heights) {
        int pointer1 = 0;
        int pointer2 = 1;
        int result = -1;
        Map<Integer, Integer> containers = new HashMap<>();

        while(pointer2 < heights.length) {
            if(heights[pointer1] < heights[pointer2]) {
                containers.put(pointer1, pointer2);
                pointer1 = pointer2;
                pointer2++;
            } else {
                pointer2++;
            }
        }

        for(int k : containers.keySet()) {
            int bound1 = heights[k];
            int bound2 = heights[containers.get(k)];
            for(int i = k + 1; i < containers.get(k); i++) {
                if(heights[i] > bound1) {
                    bound1 = heights[i];
                } else if(heights[i] > bound2) {
                    bound2 = heights[i];
                }
            }
            int area = bound1 * bound2;
            result = (area > result) ? area : result;
        }

        return result;
    }
}
