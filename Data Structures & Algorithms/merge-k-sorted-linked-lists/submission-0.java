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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.val, b.val)
        );

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        
        for(ListNode node : lists) {
            if(node != null) {
                pq.offer(node);
            }
        }

        while(!pq.isEmpty()) {
            temp.next = pq.poll();
            temp = temp.next;

            if(temp.next != null) {
                pq.offer(temp.next);
            }

        }
        return dummy.next;
    }
}
