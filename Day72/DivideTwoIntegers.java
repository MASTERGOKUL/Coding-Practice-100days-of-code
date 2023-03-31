//problem : https://leetcode.com/problems/divide-two-integers/description/
class Solution {
    public int divide(int dividend, int divisor) {
        System.out.println(Integer.MIN_VALUE);
        int ans = dividend/divisor;
        if(ans==Integer.MIN_VALUE && divisor==-1){
            ans=-(ans+1);
        }
        return ans;
    }
}