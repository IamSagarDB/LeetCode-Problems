package in.dropcodes;

/*
Author : Sagar D B (iamSagarDB)
github: https://github.com/iamsagardb

206. Reverse Linked List

Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?
 */

public class P206_Reverse_Linked_List {
    class ListNode {
        int val;
        ListNode next;
        public ListNode(int x) {
            val = x;
        }

        // LeetCode Function
        public ListNode reverseList(ListNode head) {
            ListNode pre = null;
            while (head != null) {
                ListNode next = head.next;
                head.next = pre;
                pre = head;
                head = next;
            }
            return pre;
        }
    }
}
