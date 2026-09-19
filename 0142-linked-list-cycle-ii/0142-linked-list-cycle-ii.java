/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
         int length=0;
        while( fast != null && fast.next != null){
               
                fast = fast.next.next;
                slow = slow.next;

                if(slow == fast){
                   
                 ListNode pos = slow;
                 
                do{
                    pos = pos.next;
                    length++;
                }
                while(pos != slow);
                break;
                }
                 }
                if(length <=0){
                    return null;
                }
                fast = head;

                while(length > 0){
                    slow = slow.next;
                    length--;
                }
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
       return fast;
    }
}