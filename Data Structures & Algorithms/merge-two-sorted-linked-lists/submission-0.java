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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode dummyHead = dummy;
        ListNode head1 = list1;
        ListNode head2 = list2;

        while(head1 != null && head2 != null) {
            if(head1.val <= head2.val) {
                dummy.next = head1;
                dummy = dummy.next;
                head1 = head1.next;
            } else {
                dummy.next = head2;
                dummy = dummy.next;
                head2 = head2.next;
            }
        }
        while(head1 != null) {
            dummy.next = head1;
            dummy = dummy.next;
            head1 = head1.next;
        }
        while(head2 != null) {
            dummy.next = head2;
            dummy = dummy.next;
            head2 = head2.next;
        }
        return dummyHead.next;
    }
}