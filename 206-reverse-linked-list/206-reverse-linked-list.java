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
    public ListNode reverseList(ListNode head) {
        if(head == null) 
            return null;
        if(head.next == null)
            return head;
        ListNode front = null;
        ListNode curr = head;
        ListNode back = head.next;
        while(curr != null) {
            curr.next = front;
            front = curr;
            curr = back;
            if(back != null)
                back = curr.next;
        }
        return front;
    }
}