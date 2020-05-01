package in.dropcodes;

/*
Author : Sagar D B (iamSagarDB)
github: https://github.com/iamsagardb

Problem 1290. Convert Binary Number in a Linked List to Integer

Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

Example 1:
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10

Example 2:
Input: head = [0]
Output: 0

Example 3:
Input: head = [1]
Output: 1

Example 4:
Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
Output: 18880

Example 5:
Input: head = [0,0]
Output: 0

Constraints:

-> The Linked List is not empty.
-> Number of nodes will not exceed 30.
-> Each node's value is either 0 or 1.
 */
public class P1290_Convert_Binary_Number_in_a_Linked_List_to_Integer {
    // LeetCode Function

    public int getDecimalValue(ListNode head) {
        int len = 0;
        ListNode node = head;
        while (head != null) {
            len++;
            head = head.next;
        }

        int dec = 0;
        while (node != null) {
            dec += node.val * Math.pow(2, len - 1);
            len--;
            node = node.next;
        }
        return dec;
    }
}
