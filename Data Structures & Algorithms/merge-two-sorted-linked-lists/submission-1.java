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
        ListNode result = new ListNode();
        ListNode resultHead = new ListNode();
        boolean first = true;

        while(list1 != null && list2 != null) {
            if(list1.val == list2.val) {
                result.next = new ListNode(list1.val);
                if(first) {
                    resultHead = result.next;
                    first = false;
                }
                result.next.next = new ListNode(list2.val);
                result = result.next.next;
                list1 = list1.next;
                list2 = list2.next;
            } else if(list1.val > list2.val) {
                result.next = new ListNode(list2.val);
                result = result.next;
                list2 = list2.next;
            } else {
                result.next = new ListNode(list1.val);
                result = result.next;
                list1 = list1.next;
            }

            if(first) {
                resultHead = result;
                first = false;
            }
        }
       
        if(list1 != null) {
            while(list1 != null) {
                result.next = new ListNode(list1.val);
                if(first) {
                    resultHead = result.next;
                    first = false;
                }
                result = result.next;
                list1 = list1.next;
            }
        } else {
            while(list2 != null) {
                result.next = new ListNode(list2.val);
                if(first) {
                    resultHead = result.next;
                    first = false;
                }
                result = result.next;
                list2 = list2.next;
            }
        }

        return resultHead;
    }
}