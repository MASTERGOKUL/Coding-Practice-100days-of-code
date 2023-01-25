/*https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int inserted=1;
        for(int i=1;i<nums.length;i++){
                if(nums[i]!=nums[i-1]){
                     nums[inserted]=nums[i];
                     inserted++;
                }
            
        }
        return inserted;
    }
}