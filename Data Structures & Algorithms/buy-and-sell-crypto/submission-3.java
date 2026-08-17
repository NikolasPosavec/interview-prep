class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) {
            return 0;
        }
        
        int l = 0;
        int r = 1;
        int profit = 0;

        while(r < prices.length) {
            if(prices[r] < prices[l]) {
                l = r;
                r++;
            } else if(prices[r] > prices[l]) {
                profit = (prices[r] - prices[l] > profit) ? prices[r] - prices[l] : profit;
                r++;
            } else {
                r++;
            }
        }

        return profit;
    }
}
