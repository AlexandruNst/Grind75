class Solution {

    // T: O(n)
    // S: O(1)
    public int maxProfit(int[] prices) {
        int minSoFar = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            minSoFar = Math.min(price, minSoFar);
            profit = Math.max(profit, price - minSoFar);
        }
        return profit;
    }
}

// Go through the array once. Keep track of the minimum price encountered so
// far. Each price, take the max between previous profit and current price - the
// minimum so far.
// Can also be solved with Sliding Window - see video