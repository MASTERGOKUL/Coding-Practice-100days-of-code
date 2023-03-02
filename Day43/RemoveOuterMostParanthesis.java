/* problem : https://leetcode.com/problems/remove-outermost-parentheses/description/ */
class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        String ans="";
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(stack.size()>0){
                    ans+=s.charAt(i);
                }
                System.out.println(s.charAt(i));
                stack.push(s.charAt(i));
            }else{
                stack.pop();
                if(stack.size()>0){
                    ans+=s.charAt(i);
                }
                System.out.println(s.charAt(i));
            }
        }
        return ans;
    }
}