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
    public static ListNode deleteMiddle(ListNode head) {
        if(head == null) return null;

        ListNode node = head;
        int nodeCount = 1;
        while(node.next != null) {
            nodeCount++;
            node = node.next;
        }

        ListNode temp = head;
        int deleteIndex = nodeCount/2;

        if(deleteIndex == 0) return temp.next;

        for(int i = 0; temp != null && i < deleteIndex - 1; i++) {
            temp = temp.next;
        }

        ListNode next = temp.next.next;
        temp.next = next;
        return head;
    }
}