//problem : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int sum = 0;
        while(true){
            sum = numbers[left]+numbers[right];
            if(sum==target) return new int[]{left+1,right+1};
            if(sum<target){
                left++;
            }else{
                right--;
            }
        }
    }
}