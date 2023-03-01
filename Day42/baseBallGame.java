/*problem : https://leetcode.com/problems/baseball-game/description/ */
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack =new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            char ch=operations[i].charAt(0);
            if(Character.isDigit(ch)){
                stack.push(Integer.parseInt(operations[i]));
            }
            else if(ch=='-'){
                stack.push(Integer.parseInt(operations[i]));
            }
            else{
                switch(ch){
                    case '+':
                    int temp1=stack.peek();
                    stack.pop(); 
                    int temp2=stack.peek();
                    stack.push(temp1);
                    stack.push(temp1+temp2);
                    break;
                    case 'D':
                    int temp=stack.peek();
                    stack.push(temp*2);
                    break;
                    case 'C':
                    System.out.println(stack.pop());
                    break;
                }
            }
        }
        while(!stack.empty()){
            System.out.println(stack.peek());
            sum+=stack.pop();
        }
        return sum;
    }
}