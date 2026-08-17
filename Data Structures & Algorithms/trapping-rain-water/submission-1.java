class Solution {
    public int trap(int[] height) {
        if(height.length == 0) {
            return 0;
        }
        
        int maxL = height[0];
        int maxR = height[height.length - 1];
        int water = 0;
        
        int l = 0;
        int r = height.length - 1;
        while(l < r) {
            if(maxL == maxR || maxL < maxR) {
                l++;
                maxL = (height[l] > maxL) ? height[l] : maxL;
                water = (maxL - height[l] > 0) ? water + maxL - height[l] : water;
            } else {
                r--;
                maxR = (height[r] > maxR) ? height[r] : maxR;
                water = (maxR - height[r] > 0) ? water + maxR - height[r] : water;
            } 
        }

        return water;
    }
}
