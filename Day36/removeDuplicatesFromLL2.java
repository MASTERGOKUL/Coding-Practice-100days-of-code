/*problem: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/ *
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
    public ListNode deleteDuplicates(ListNode head) {
         ListNode sentinel = new ListNode(0, head);
        ListNode temp=sentinel;
        while(head!=null ){
               if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;    
                }
                temp.next = head.next;     
            } else {
                temp = temp.next;    
            }
            head = head.next;
        }
        return sentinel.next;
    }
}