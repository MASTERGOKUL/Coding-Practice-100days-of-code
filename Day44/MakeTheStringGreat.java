/*problem: https://leetcode.com/problems/make-the-string-great/description/*/
class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!stack.empty() && Math.abs(stack.peek()-s.charAt(i))==32){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        char[] ans = new char[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            ans[i]= stack.pop();
        }
        return new String(ans);
    }
}