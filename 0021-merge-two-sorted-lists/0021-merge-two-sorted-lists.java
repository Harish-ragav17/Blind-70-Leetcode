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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
          ListNode temp=null;
          ListNode trav=null;
          int val1=0,val2=0;
          if(list1!= null && list2!= null)
           {   
               if(list1.val<=list2.val)
                {
                    temp=list1;
                    list1=list1.next;
                }
                else
                {
                    temp=list2;
                    list2=list2.next;
                }
                trav=temp;
                while(list1!=null && list2!=null)
                {  
                    val1=list1.val;
                    val2=list2.val;
                    if(val1<=val2)
                    {
                        trav.next=list1;
                        list1=list1.next;
                        trav=trav.next;
                    }
                    else
                    {
                        trav.next=list2;
                        list2=list2.next;
                        trav=trav.next;
                    }
                }
             }
              if(list1 == null && list2 !=null)
                {
                    if(trav==null)
                    {  
                        trav=list2;
                        temp=trav;
                    }
                    else
                    {
                        trav.next=list2;  
                    }
                }else if(list1 != null & list2 ==null)
                {
                    if(trav==null)
                    {
                        trav=list1;
                        temp=trav;
                    }
                    else
                    {
                        trav.next=list1;  
                    }
                }
      return temp;
    }
}