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
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        
        Map<ListNode, Integer> seen = new HashMap<>();
        while(head.next != null) {
            if(!(seen.containsKey(head))) {
                seen.put(head, 1);
            } else {
                return true;
            }
            head = head.next;
        }

        return false;
    }
}
