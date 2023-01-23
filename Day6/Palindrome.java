/*

https://leetcode.com/problems/palindrome-number/

*/


class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp=0;
        for(int i=x;i>0;i/=10){
            temp=temp*10+i%10;
        }
        if(x==temp) return true;
        else return false;
    }
}