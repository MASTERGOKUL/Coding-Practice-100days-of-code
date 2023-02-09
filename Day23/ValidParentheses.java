/*poblem:https://leetcode.com/problems/valid-parentheses/description/*/
class Solution {
    public boolean isValid(String str) {
        Stack <Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            switch(c){
                case '(':
                case '{':
                case '[':
                stack.push(c);
                break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')

                    {
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                    {
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[')
                    {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}