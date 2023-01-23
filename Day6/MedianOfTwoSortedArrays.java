/*

https://leetcode.com/problems/median-of-two-sorted-arrays/description/

*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length+nums2.length];
        for(aint i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            arr[i+nums1.length]=nums2[i];
        }
        Arrays.sort(arr);
    double ans=0;
    int lengths=nums1.length+nums2.length;
    if(lengths%2==0){
    int p= lengths/2;
    ans=(arr[p-1]+arr[p])/2.0;
    // System.out.println(arr[p]+" "+arr[p+1]);
    }
    else{
        ans=arr[lengths/2];
    }
    return ans;
    }
}