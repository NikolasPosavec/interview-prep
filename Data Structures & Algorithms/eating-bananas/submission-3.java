class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k = 0;

        Arrays.sort(piles);
        int l = 1;
        int r = piles[piles.length - 1];
        
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
