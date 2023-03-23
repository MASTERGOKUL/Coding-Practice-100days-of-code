//problem : https://leetcode.com/problems/contains-duplicate-ii/description/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        TreeMap<Integer,Integer> t=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(t.containsKey(num) && i-t.get(num)<=k){
                return true;
            }
            t.put(num,i);
        }
        return false;
    }
}