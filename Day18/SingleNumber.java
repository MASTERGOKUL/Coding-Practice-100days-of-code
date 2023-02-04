/*problem : https://leetcode.com/problems/single-number/description/*/
class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1) return nums[0];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                System.out.println(nums[i]+" " +i);
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}