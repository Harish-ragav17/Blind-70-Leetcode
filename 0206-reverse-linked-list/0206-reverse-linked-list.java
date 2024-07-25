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
    public ListNode reverseList(ListNode head) {
        ListNode temp1,temp2;
        Stack<Integer> values=new Stack<>();
        if(head==null)
        {
          return null;
        }
        temp1=head;
        while(temp1!=null)
        {
           values.push(temp1.val);
           temp1=temp1.next;
        }
        temp1=head;
        while(!(values.isEmpty()))
        {
            temp1.val=values.pop();
            temp1=temp1.next;
        }
      return head;
    }
}