//problem : https://leetcode.com/problems/maximum-difference-by-remapping-a-digit/
class Solution {
    public int minMaxDifference(int num) {
        char x[]=String.valueOf(num).toCharArray();
        char y[]=String.valueOf(num).toCharArray();
        char p=x[0],q=x[0];
        for(int i=0;i<x.length;i++)
        {
            if(x[i]!='9')
            {
                p=x[i];
                break;
            }
        }
        for(int i=0;i<x.length;i++)
        {
            if(x[i]==p)
            {
                x[i]='9';
            }
        }
        for(int i=0;i<x.length;i++)
        {
            if(y[i]==q)
            {
                y[i]='0';
            }
        }
        return Integer.parseInt(String.valueOf(x)) - Integer.parseInt(String.valueOf(y));
    }
}