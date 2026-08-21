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
        int len = 0;
        ListNode lenCopy = head;
        while(lenCopy.next != null) {
            len++;
            lenCopy = lenCopy.next;
        }
        
        int offset = 1;
        int count = 0;
        while(count < len) {
            if(count % 2 == 0) {
                head = head.next;
            } else {
                int temp = count;
                ListNode reorderCopy = head;
                while(temp < len - offset) {
                    reorderCopy = reorderCopy.next;
                }
                ListNode next = head.next;
                head.next = reorderCopy;
                head.next.next = next;
                offset++;
            }

            count++;
        }
    }
}
