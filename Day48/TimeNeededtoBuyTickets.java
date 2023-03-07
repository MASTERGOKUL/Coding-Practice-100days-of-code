/*problem : https://leetcode.com/problems/time-needed-to-buy-tickets/description/ */
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int ans=0;
        while(true){
            for(int i=0;i<tickets.length;i++){
            if(tickets[i]==0) continue; 
            tickets[i]--;
            ++ans;
            if(tickets[k]==0) return ans;
            }
        }
    }
}