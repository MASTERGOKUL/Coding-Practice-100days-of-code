/*problem:https://leetcode.com/problems/design-circular-queue/description/ */
class MyCircularQueue {

    private int front;
    private int rear;
    private int[] arr;
    private int cap;
    
    
    public MyCircularQueue(int k) {
        arr = new int[k];
        cap=k;
        front=-1;
        rear=-1;
    }
    
    public boolean enQueue(int value) {
        if(isFull())return false;
        if(front==-1){
            front=0;
            rear=0;
            arr[rear]=value;
            return true;
        }
        rear = (rear+1)%cap;
        arr[rear]=value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())return false;
        if(front==rear){
            front=-1;
            rear=-1;
            return true;
        }
        front=(front+1)%cap;
        return true;
    }
    
    public int Front() {
        if(front==-1)return -1;
        return arr[front];
    }
    
    public int Rear() {
        if(rear==-1)return -1;
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return front==-1;
    }
    
    public boolean isFull() {
        return front!=-1 && (rear+1)%cap==front;
    }
}