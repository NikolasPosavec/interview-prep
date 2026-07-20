class Solution {
    public int maxArea(int[] heights) {
        int p1 = 0;
        int p2 = heights.length - 1;
        int maxArea = -1;

        while(p1 < p2) {
            int bound1 = p2 - p1;
            int bound2 = Math.min(heights[p1], heights[p2]);
            int currArea = bound1 * bound2;
            maxArea = (currArea > maxArea) ? currArea : maxArea;

            if(heights[p1] < heights[p2]) {
                p1++;
            } else {
                p2--;
            }
        }

        return maxArea;
    }
}
