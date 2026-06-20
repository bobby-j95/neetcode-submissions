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
        ListNode slow = head, fast = head.next;

        //finds mid value
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverses second half
        ListNode secondHalf = slow.next;
        slow.next = null;
        ListNode prev = null;

        while (secondHalf != null){
            ListNode temp = secondHalf.next;
            secondHalf.next = prev;
            prev = secondHalf;
            secondHalf = temp;
        }

        //merge two halfs
        ListNode first = head;
        secondHalf = prev;

        while (secondHalf != null){
            ListNode temp1 = first.next, temp2 = secondHalf.next;
            first.next = secondHalf;
            secondHalf.next = temp1;
            first = temp1;
            secondHalf = temp2;
        }

    }
}
