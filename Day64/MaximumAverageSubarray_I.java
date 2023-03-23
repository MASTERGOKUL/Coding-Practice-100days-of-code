//problem : https://leetcode.com/problems/maximum-average-subarray-i/description/
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max_avg=-Double.MAX_VALUE,temp=0;
        for(int i=0;i<nums.length;i++){
            if(i<k){
                temp+=nums[i];
            }
            else{
                double curr=temp/k;
                if(max_avg<curr){
                   max_avg=curr;
                }
                temp+=nums[i]-nums[i-k];
            } 
        }
        double curr=temp/k;
        if(max_avg<curr){
            max_avg=curr;
        }
        return max_avg;//k==n?curr:max_avg;
    }
}