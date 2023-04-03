//problem : https://leetcode.com/problems/counting-bits/description/
class Solution {
    public int[] countBits(int num) {
    int[] ans = new int[num+1];
    ans[0] = 0;
    int pow = 1;
    for(int i = 1, t = 0; i <= num; i++, t++) {
        if(i == pow) {
            pow *= 2;
            t = 0;
        }
        ans[i] = ans[t] + 1;
    }
    return ans;
}

}