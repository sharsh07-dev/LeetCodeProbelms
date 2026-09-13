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
        int length = 0;
        ListNode f = head;
        ListNode s = head;
        while(f != null && f.next != null){
            f = f.next.next;
            s = s.next;
            if( f == s){
               
               ListNode temp = s;
               do{
                     temp = temp.next;
                     length++;
               }
               while(temp != s);
                break;
               }
              
              
            }
       if( length == 0){
                return null;
               }
     f= head;
        while( length > 0){
            s= s.next;
            length--;
        }
        while (f != s){
            f = f.next;
            s = s.next;
        }
        return f;
    }
}