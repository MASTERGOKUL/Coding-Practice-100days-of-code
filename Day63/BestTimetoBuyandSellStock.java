//problem : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
class Solution {
     public int maxProfit(int[] prices) {
        int buy = prices[0];
        int ans = 0;
        for(int i=1;i<prices.length;i++){
            if(buy > prices[i]){
                buy = prices[i];
            }
            else if(prices[i] - buy > ans){
                ans = prices[i]-buy;
            }
        }
        return ans;
        
    }

}