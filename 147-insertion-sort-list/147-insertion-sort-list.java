/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * System.out.println("Hi2");
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode result = new ListNode(0);
        ListNode current = head;
        ListNode nxt = null;
        ListNode prv = result;
        while(current != null){
            nxt = current.next;
            while(prv.next != null && prv.next.val < current.val){
                prv = prv.next;
            }
            current.next = prv.next;
            prv.next = current;
            prv = result;
            current = nxt;
        }
        return result.next;
    }
}