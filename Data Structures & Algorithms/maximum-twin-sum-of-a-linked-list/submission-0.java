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
    public int pairSum(ListNode head) {
        if (head == null){
            return 0;
        }

        ListNode slow = head, fast = head.next;
        int firstVal = 0, secondVal = 0;

        //finds mid value
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //gets value of second half and reverses order
        ListNode secondHalf = slow.next;
        slow.next = null;
        ListNode prev = null;

        while(secondHalf != null){
            ListNode temp = secondHalf.next;
            secondHalf.next = prev;
            prev = secondHalf;
            secondHalf = temp;
        }
        
        //does math
        int ans = 0;
        ListNode slow2 = head;
        secondHalf = prev; //this resets secondHalf to mid point after reversing

        while(secondHalf != null){
            ans = Math.max(ans, (secondHalf.val + slow2.val));
            secondHalf = secondHalf.next;
            slow2 = slow2.next;
        }

        return ans;
    }
}