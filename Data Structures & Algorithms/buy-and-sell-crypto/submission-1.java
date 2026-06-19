class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, minPrice = prices[0];

        //need to start at 1 since minPrice at 0
        for(int x = 1; x < prices.length; x++){
            //calculate profit at current price
            int profit = prices[x] - minPrice;

            //maxProfit = profit if its higher val
            if(profit > max){
                max = profit;
            }
            
            //update minPrice if its higher that current price
            if(prices[x] < minPrice){
                minPrice = prices[x];
            }
        }

        return max;
    }
}
