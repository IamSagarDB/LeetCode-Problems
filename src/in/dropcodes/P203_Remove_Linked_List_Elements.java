package in.dropcodes;

/*
Author : Sagar D B (iamSagarDB)
github: https://github.com/iamsagardb

Problem 203. Remove Linked List Elements

Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5

 */

public class P203_Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {

        /* this condition is to check if the 1st node is targeted value
         if yes then get rid of 1st node */

        while(head != null && head.val == val){
            head = head.next;
        }

        /*
        if the first node is not the targeted value then
        */
        ListNode temp = head;

        while(temp != null && temp.next != null){
            if(temp.next.val == val){
                temp.next= temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;

    }
}
