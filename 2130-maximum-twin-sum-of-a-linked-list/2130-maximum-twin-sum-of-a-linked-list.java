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
        
        ListNode temp = head;
        ListNode mid = getMid(head);
        ListNode midNext = mid.next;
        mid.next = null;
        ListNode rev = reverse(midNext);
        int max =0;
        while(rev != null){
            int sum = temp.val + rev.val;
            max = Math.max(sum,max);
            temp = temp.next;
            rev = rev.next;
        }
    return max;

    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode getMid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next!= null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}