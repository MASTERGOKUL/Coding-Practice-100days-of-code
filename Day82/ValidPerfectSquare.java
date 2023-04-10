//problem : https://leetcode.com/problems/valid-perfect-square/description/
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        else if(num==0) return false;
        else{
            for(long i=num/2;i>0;i--){
                if(i*i==num){
                    return true;
                }
            }
            return false;
        }
    }
}