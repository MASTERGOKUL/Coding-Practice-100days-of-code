//problem : https://leetcode.com/problems/majority-element/description/
class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length<=1) return nums[0];
        int max=0;
        Arrays.sort(nums);
        int temp=0;
        int ans=0;
        int i=0;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                temp++;
            }
            else{
                if(temp>max) {
                    System.out.println(temp+" "+max+" "+ans+" "+nums[i]);
                max=temp;
                ans=nums[i]; 
                }
                temp=0;
            }
        }
        if(temp>max) ans=nums[i];
        return ans;
    }
}