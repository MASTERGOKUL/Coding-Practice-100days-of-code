/* problem : https://leetcode.com/problems/implement-queue-using-stacks/description/*/
class MyQueue {

        Stack<Integer> stack1 = new Stack<Integer>();
    public MyQueue() {
    }
    
    public void push(int x) {
        Stack<Integer> stack2 = new Stack<Integer>();
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
    }
    
    public int pop() {
        return stack1.pop();
    }
    
    public int peek() {
        return stack1.peek();
    }
    
    public boolean empty() {
        return stack1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */