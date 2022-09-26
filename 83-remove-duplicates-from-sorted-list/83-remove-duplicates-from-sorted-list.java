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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        ListNode before = head, after = head.next;
        while(after != null) {
            if(before.val == after.val) {
                ListNode temp = after.next;
                before.next = temp;
                after = temp;
            }
            else {
                before = before.next;
                after = after.next;
            }
        }
        return head;
    }
}