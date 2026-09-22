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

    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || k==0 || head.next== null){
            return head;
        }
        // calculate len
    ListNode temp = head;
    int len =1;
        while(temp.next!= null){
            temp = temp.next;
            len++;
        }
        k = k % len;
        if(k ==0){
            return head;
        }
            temp.next = head;
        
        int newe = len - k;

        ListNode newHead = head;
        for(int i =1 ;i <newe ;i++){
            newHead = newHead.next;
        }   
       head = newHead.next;
       newHead.next = null;
        return head;
    }
}