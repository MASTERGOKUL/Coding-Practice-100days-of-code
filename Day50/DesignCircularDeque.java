//problem : https://leetcode.com/problems/design-circular-deque/description/
class MyCircularDeque {

    int[] queue;
    int front, tail;
    int count;
    public MyCircularDeque(int k) {
        queue = new int[k];
        front = -1;
        tail = -1;
        count = 0;
    }
     
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        front = (front - 1 + queue.length) % queue.length;
        if (isEmpty()) {
            tail = front;
        }
        queue[front] = value;
        count++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        tail = (tail + 1) % queue.length;
        if (isEmpty()) {
            front = tail;
        }
        queue[tail] = value;
        count++;
        return true;
    }
    
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % queue.length;
        count--;
        return true;
    }
    
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        tail = (tail - 1 + queue.length) % queue.length;
        count--;
        return true;
    }
    
    public int getFront() {
        return isEmpty() ? -1 : queue[front];
    }
    
    public int getRear() {
        return isEmpty() ? -1 : queue[tail];
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull() {
        return count == queue.length;
    }
}