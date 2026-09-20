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
        ArrayList <Integer> list = new ArrayList<>();
         
        ListNode temp = head;
        while( temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        for(int i = list.size()-1 ;i >0 ;i--){
            temp.val = list.get(i);
              temp = temp.next;
        }
        temp = head;
     for(int i = 0 ;i < list.size()-1 ;i++){
           if(temp.val != list.get(i)){
            return false;
           }
           temp = temp.next;
        }
       return true;
    }
}