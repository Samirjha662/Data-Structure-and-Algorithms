1class Solution {
2    public int maxProfit(int[] prices) {
3        int minPrice = prices[0];
4        int maxProfit = 0;
5
6        for(int i =1; i< prices.length ;i++){
7            int profit = prices[i]- minPrice;
8            minPrice = Math.min(prices[i],minPrice);
9            maxProfit = Math.max(maxProfit, profit);
10        }
11
12        return maxProfit;
13        
14    }
15}