/*

https://leetcode.com/problems/add-two-numbers/description/

*/

/**
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1=0;
        int num2=0;
        int i=1;
        while(l1.next!=null){
            num1=num1+(i*l1.val);
            l1=l1.next;
            i*=10;
        }
        num1=num1+(i*l1.val);
        i=1;
        while(l2.next!=null){
        num2=num2+(i*l2.val);
        l2=l2.next;
        i*=10;
        }
        num2=num2+(i*l2.val);
        int sum = num1+num2;
        
        ListNode output=new ListNode(sum%10);
        ListNode curr = output;
        for(int j=sum/10;j>0;j/=10){
            curr.next = new ListNode(j % 10);
            curr = curr.next;
        }
        return output;

    }
}