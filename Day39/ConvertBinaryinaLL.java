/*problem : https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/*
*reference : https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/solutions/629087/detailed-explanation-java-faster-than-100-00/*
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
    public int getDecimalValue(ListNode head) {
        int count =0;
        ListNode temp = head;
        while(temp!=null){
            count*=2;
            count+=temp.val;
            temp=temp.next;
        }
        return count;
    }
}