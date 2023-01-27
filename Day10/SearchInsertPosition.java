/* problem : https://leetcode.com/problems/search-insert-position/description/*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid=end/2;
        int find=0;
        boolean flag=false;
        int min=0;
        while(start<=end){
            if(nums[mid]==target){
                find=mid;
                flag=true;
                break;
            }
            else if(nums[mid]>target){
                end=mid-1;
            System.out.println("else if"+nums[mid]);
            mid=(start+end)/2;
            }
            else{
                start=mid+1;
                min=mid;
            mid=(start+end)/2;
            System.out.println("else "+nums[mid]);
            }
            System.out.println(nums[mid]);
        }
        if(!flag){
            if(nums[min]>target)
            find=min;
            else
            find=min+1;
        }
        return find;
    }
}