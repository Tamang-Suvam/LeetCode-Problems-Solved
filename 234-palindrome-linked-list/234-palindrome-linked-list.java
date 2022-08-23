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
    public boolean isPalindrome(ListNode head) {
        
        if(head.next == null){
            return true;
        }
//         while(temp.next != null && temp.next.val != -1){
//             temp = temp.next;
//             if((temp.next == null || temp.next.val == -1) && temp.val == head.val){
//                 temp.val = -1;
//                 head = head.next;
//                 temp = head;
//             }
//         }
//         if(head.next.val == -1){
//             temp.val = -1;
//         }
       
//         return temp.val == -1;
        ListNode fast = head;
        ListNode slow = head;
        Stack <Integer> stack = new Stack <> ();
        Boolean result = true;
        
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        if(fast != null) 
            slow = slow.next;
        
        ListNode temp = slow;
        while(temp!=null){
            stack.push(temp.val);
            temp = temp.next;
        }
        
        while(head != slow && !stack.empty()){
            if(head.val != stack.pop())
                result = false;
            head = head.next;
        }
       
        return result;
  }
}