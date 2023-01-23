/*

https://leetcode.com/problems/reverse-integer/description/

*/



class Solution {
    public int reverse(int x) {
        int out =0;
        boolean flag=false;
        if(x<0){
            flag=true;
            x=-x;
        }
        for(int i=x;i>0;i/=10){
            if (out > Integer.MAX_VALUE/10 || (out == Integer.MAX_VALUE / 10 && i%10 > 7)) return 0;
            if (out < Integer.MIN_VALUE/10 || (out == Integer.MIN_VALUE / 10 && i%10 < -8)) return 0;
            out=out*10+i%10;
            System.out.println(out);
        }
        if(flag) out=-out;
        return out;
    }
}