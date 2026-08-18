class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k = 0;
        int max = -1;
        for(int i : piles) {
            max = (max < i) ? i : max;
        }
        int l = 1;
        int r = max;
        
        while(l <= r) {
            int mid = (l + r) / 2;
            int hours = h;
            for(int p : piles) {
                hours -= Math.ceil((double)(p) / mid);
            }
                
            if(hours < 0) {
                l = mid + 1;
            } else if(hours <= h) {
                k = mid;
                r = mid - 1;
            }
        }
        
        return k;
    }
}
