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
        ListNode prev = null; // Points to the previous node in the reversed list.
        ListNode curr = head; // Points to the current node being processed.
        ListNode forw = null; // Points to the next node in the original list.
        
        while(curr != null){
            forw = curr.next; // Save the next node in the original list.
            curr.next = prev; // Reverse the link to the previous node.
            prev = curr; // Move prev to the current node.
            curr = forw; // Move curr to the next node in the original list.  
            
        }
        return prev;
    }
}