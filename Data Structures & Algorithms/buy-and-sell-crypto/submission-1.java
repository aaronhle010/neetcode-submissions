class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = 100;
        int maxSell = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minBuy){
                minBuy = prices[i];
            }

            if(prices[i] - minBuy > maxSell){
                maxSell = prices[i] - minBuy;
            }
        }

        return maxSell;

    }
}
