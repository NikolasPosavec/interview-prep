class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k = 0;

        Arrays.sort(piles);
        for(int i = 1; i <= piles[piles.length - 1]; i++) {
            int l = 1;
            int r = piles[piles.length - 1];
            while(l <= r) {
                int mid = (l + r) / 2;
                int hours = h;
                for(int p : piles) {
                    int count = 0;
                    while(p > 0) {
                        p -= mid;
                        count++;
                    }
                    hours -= count;
                }
                if(hours < 0) {
                    l = mid + 1;
                } else if(hours <= h) {
                    k = mid;
                    r = mid - 1;
                }
            }
        }
        
        return k;
    }
}
