/*problem : https://leetcode.com/problems/middle-of-the-linked-list/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        count=count/2;
        temp=head;
        while(count-->0 && temp!=null){
            temp=temp.next;
        }
        return temp;
    }
}