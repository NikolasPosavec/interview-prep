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
                maxL = Math.max(maxL, height[l]);
                water += maxL - height[l];
            } else {
                r--;
                maxR = Math.max(maxR, height[r]);
                water += maxR - height[r];
            } 
        }

        return water;
    }
}
