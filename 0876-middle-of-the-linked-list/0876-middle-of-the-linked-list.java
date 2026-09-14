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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int length=0;
        while( temp != null){
            temp = temp.next;
            length++;
        }
        ListNode Fast = head;
        ListNode Slow = head;

    if(head.next == null){
        return head;
    }
     
            
        while(Fast != null && Fast.next != null){
             Fast = Fast.next.next;
             Slow = Slow.next;
        
        }

        // if( length % 2 ==0){
        //     return Slow;
        // }
        return Slow;
    }

    
}