/*problem :  https://leetcode.com/problems/crawler-log-folder/description/*/
class Solution {
    public int minOperations(String[] logs) {
        int count=0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].startsWith("..")) count--;
            else if(logs[i].startsWith("./")) continue;
            else count++;

            if(count < 0) count =0;
        }

        return count<0? 0 : count;

    }
}