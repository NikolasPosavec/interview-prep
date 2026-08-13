class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> indices = new Stack<>();
        int maxArea = 0;

        for(int i = 0; i < heights.length; i++) {
            if(i == 0) {
                indices.push(i);
                maxArea = (maxArea < heights[i]) ? heights[i] : maxArea;
            } else if(heights[i] >= heights[indices.peek()]) {
                indices.push(i);
                maxArea = (maxArea < heights[i]) ? heights[i] : maxArea;
            } else {
                int poppedInd = -1;
                while(!indices.isEmpty() && heights[i] < heights[indices.peek()]) {
                    poppedInd = indices.pop();
                    int tempArea = heights[i] * (i - poppedInd + 1);
                    maxArea = (maxArea < tempArea) ? tempArea : maxArea;
                }
                heights[poppedInd] = heights[i];
                indices.push(poppedInd);
            }
        }

        while(!indices.isEmpty()) {
            int ind = indices.pop();
            int tempArea = (heights.length - ind) * heights[ind];
            maxArea = (maxArea < tempArea) ? tempArea : maxArea;
        }

        return maxArea;
    }
}
