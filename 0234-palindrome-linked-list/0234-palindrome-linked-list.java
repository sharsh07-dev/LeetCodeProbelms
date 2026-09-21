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
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next== null){
            return true;
        }

        ListNode temp = head;
        ListNode mid = getMid(head);
        ListNode secoundHalf = mid.next;
        mid.next =null;
        ListNode rev = reverse(secoundHalf);
        ListNode shalf = rev;
    
        while(shalf != null){
            if(shalf.val != temp.val){
                return false;
            }
           shalf = shalf.next;
            temp = temp.next;
        }
        return true;
    }
    public ListNode getMid(ListNode head){

         ListNode fast = head;
         ListNode slow = head;

         while( fast.next!= null && fast.next.next!= null ){
                fast = fast.next.next;
                slow = slow.next;
         }
       
         return slow;
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while( curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}