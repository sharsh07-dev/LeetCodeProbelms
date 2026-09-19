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
    public ListNode sortList(ListNode head) {

if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return  merge(left,right);
    }
    public ListNode merge(ListNode head1 ,ListNode head2){

        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                tail.next = head1;
                tail = tail.next;
                head1 = head1.next;
            }
            else{
                 tail.next = head2;
                tail = tail.next;
                head2 = head2.next;
            }
        }
        while(head1 != null){
             tail.next = head1;
                tail = tail.next;
                head1 = head1.next;
        }
         while(head2 != null){
             tail.next = head2;
                tail = tail.next;
                head2 = head2.next;
        }
    return dummyHead.next;
    }
     public ListNode getMid(ListNode head) {
    if (head == null || head.next == null) {
        return null;
    }

    ListNode midPrev = null;

    while (head != null && head.next != null) {
        if (midPrev == null) {
            midPrev = head;
        } else {
            midPrev = midPrev.next;
        }

        head = head.next.next;
    }

    ListNode mid = midPrev.next;
    midPrev.next = null;

    return mid;
}
}