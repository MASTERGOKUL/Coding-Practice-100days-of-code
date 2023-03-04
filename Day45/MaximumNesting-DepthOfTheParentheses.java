/*problem: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/ */
class Solution {
    public int maxDepth(String s) {
    int ans=0;
    int max=0;
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='(')
        {
            ans++;
            
            if(ans>max)
                max=ans;
        }
       else if(s.charAt(i)==')')
           ans--;
        
    }
    return max;
    }
}