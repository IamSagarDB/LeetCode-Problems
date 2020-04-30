package in.dropcodes;

/*
Author : Sagar D B (iamSagarDB)
github: https://github.com/iamsagardb

Problem 234. Palindrome Linked List

Given a singly linked list, determine if it is a palindrome.

Example 1:
Input: 1->2
Output: false

Example 2:
Input: 1->2->2->1
Output: true
Follow up:
Could you do it in O(n) time and O(1) space?
 */
public class P234_Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // slow node reaches half of LL as fast node reaches last node
            fast = fast.next.next; // as fast node reaches last node , slow node will be at middle of the LL
        }
        slow = reverse(slow); // when slow node is at middle od LL, remaining element in LL is reversed
        fast = head; // fast node will be assigned to head and at this point slow node will be at middle of LL

        // here 1st half of the LL should be equal to 2nd half
        while (slow != null) {
            if (slow.val != fast.val) {
                return false; // now comparing 1st half and 2nd half, if its not equal it returns false
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    // Reversing Linked List
    public ListNode reverse(ListNode head) {
        ListNode temp = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = temp;
            temp = head;
            head = next;
        }
        return temp;
    }
}
