/*problem : https://leetcode.com/problems/design-front-middle-back-queue/description/ */
class FrontMiddleBackQueue {
    private int size;
    private Node head, tail, mid;

    public FrontMiddleBackQueue() {
        size = 0;
        head = tail = new Node(-1);
        head.next = tail;
        tail.prev = head;
        mid = head;    
    }
    
    public void pushFront(int val) {
        Node newNode = new Node(val);
        add(head, newNode); 
        size++;

        if (size == 1) {   
            mid = head.next;    
        }
        if (size % 2 == 0) {  
            mid = mid.prev;
        }
    }
    
    public void pushMiddle(int val) {
        Node newNode = new Node(val);
        if (size % 2 == 0) {
            add(mid, newNode);  
            mid = mid.next;
        } 
        else {
            add(mid.prev, newNode); 
            mid = mid.prev;
        }
        size++;
    }
    
    public void pushBack(int val) {
        Node newNode = new Node(val);
        add(tail.prev, newNode);    
        size++;
        if (size % 2 == 1) {
            mid = mid.next;
        }
    }
    
    public int popFront() {
        if (size == 0) {
            return -1;
        }
        if (size == 1) {  
            mid = head;   
        } else if (size % 2 == 0) {
            mid = mid.next; 
        }

        int val = head.next.value;
        delete(head.next); 
        size--;
        return val;
    }
    
    public int popMiddle() {
        if (size == 0) {
            return -1;
        }
        
        Node node = mid;
        if (size == 1) {  
            mid = head; 
        } else {
            mid = (size % 2 == 0)? mid.next : mid.prev;
        }

        delete(node);  
        size--;
        return node.value;
    }
    
    public int popBack() {
        if (size == 0) {  
            return -1;
        }
        if (size == 1) {  
            mid = head;  
        } else if (size % 2 == 1) {
            mid = mid.prev;        
        }

        int val = tail.prev.value;
        delete(tail.prev);
        size--;
        return val;
    }

    private void add(Node ref, Node newNode) {
        newNode.next = ref.next;
        ref.next = newNode;
        newNode.next.prev = newNode;
        newNode.prev = ref;
    }
    private void delete(Node node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
    private class Node {
        int value;
        Node next, prev;
        private Node(int value) {
            this.value = value;
        }
    }
}