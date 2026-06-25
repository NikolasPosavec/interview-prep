class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int total = prices[0] + prices[1];

        if(money - total < 0) {
            return money;
        } else {
            return money - total;
        }
    }
}