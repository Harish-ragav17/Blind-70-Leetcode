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
    public boolean hasCycle(ListNode head) {
     ListNode temp1,temp2;
     temp1=head;

     if(temp1!=null && temp1.next !=null && temp1.next.next !=null)
     {
        temp2=temp1.next.next;
        while( temp2!=null && temp2.next!=null)
       {
          if(temp1==temp2)
          {
            return true;
          }
          temp1=temp1.next;
          temp2=temp2.next.next;
       }
     }   
     return false;
    }
}