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
        int len = 1;
        ListNode copy = head;
        while(copy.next != null) {
            len++;
            copy = copy.next;
        }
        
        if(len - n == 0 && len == 1) {
            return null;
        } else if(len - n == 0) {
            return head.next;
        }

        ListNode start = new ListNode();
        ListNode prev = new ListNode();
        ListNode curr = head;
        int count = 0;
        while(count < len - n) {
            if(count == 0) {
                start = curr;
            }

            prev = curr;
            curr = curr.next;

            count++;
        }

        prev.next = curr.next;

        return start;
    }
}
