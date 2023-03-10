/*problem : https://leetcode.com/problems/integer-to-roman/description/ */
class Solution {
    public String intToRoman(int num) {
        int value[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String rome[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String romed="";
        for(int i=0;i<value.length &&  num>0;i++){
            while(num>=value[i]){
                romed+=rome[i];
                num-=value[i];
            }
        }
        return romed;
    }
}