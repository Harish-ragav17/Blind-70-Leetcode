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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        if(length==1 && n==1){
            head=null;
            return head;
        }
        temp=head;
        int count=0;
        if((length-n)==0){
            head=head.next;
            return head;
        } 
        while(temp.next!=null){
            if(count==(length-n)-1)
            {
                break;
            }else{
             temp=temp.next;
             count++;
            }           
        }
        temp.next=temp.next.next;   
        temp=head;
        return temp;
    }
}