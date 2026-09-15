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
    public void reorderList(ListNode head) {
        ListNode head1 = head;
        ListNode head2 = head;

        while(head2 != null && head2.next != null) {
            head1 = head1.next;
            head2 = head2.next.next;
        }
        
        head2 = head1.next; 
        head1.next = null; 

        ListNode prev = null;
        while(head2 != null) {

            ListNode next = head2.next;
            head2.next = prev;
            prev = head2;
            head2 = next;
        }

        head2 = prev;
        head1 = head;

        while(head2 != null) {
            ListNode next1 = head1.next;
            ListNode next2 = head2.next;
            
            head1.next = head2;
            head2.next = next1;
            
            head1 = next1;
            head2 = next2;
        }

    }
}