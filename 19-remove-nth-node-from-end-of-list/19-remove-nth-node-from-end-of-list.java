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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // The Brute Force solution of my own
        // ListNode temp = head;
        // int count = 0;
        // while(temp != null) {
        //     temp = temp.next;
        //     count++;
        // }
        // temp = head;
        // ListNode prev = temp;
        // int delIndex = count - n;
        // int index = -1;
        // while(temp != null) {
        //     index++;
        //     if(index == delIndex) {
        //         if(index==0) {
        //             return head.next;
        //         }
        //         prev.next = temp.next;
        //         break;
        //     }
        //     prev = temp;
        //     temp = temp.next;
        // }
        // return head;
        
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        start.next = head;
        for(int i=0;i<n+1;i++) {
            fast = fast.next;
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}